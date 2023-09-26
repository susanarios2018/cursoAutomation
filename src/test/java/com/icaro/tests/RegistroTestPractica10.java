package com.icaro.tests;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistroTestPractica10 extends BaseTest {
    @Test
    public void ingresar(){

        this.getDriver().get("https://opencart.abstracta.us");
    }
    @Test
    public void registraCuenta(){
        Faker faker=new Faker();
        HomePractica10 homePractica10=new HomePractica10(getDriver());
        RegistroPractica10 registroPractica10=new RegistroPractica10(getDriver());
        AccountPractica10 accountPractica10=new AccountPractica10(getDriver());
        homePractica10.accedeLogin();
        registroPractica10.registro(faker.name().firstName(),faker.name().lastName(),faker.internet().emailAddress(),faker.phoneNumber().phoneNumber(),faker.internet().password(),faker.internet().password());
        Assert.assertTrue(accountPractica10.validaTitulo("Account"));




    }
}
