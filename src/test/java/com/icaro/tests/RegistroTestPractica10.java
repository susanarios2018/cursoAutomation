package com.icaro.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistroTestPractica10 extends BaseTest {
    @Test
    public void ingresar(){

        this.getDriver().get("https://opencart.abstracta.us");
    }
    @Test
    public void registraCuenta(){
        HomePractica10 homePractica10=new HomePractica10(getDriver());
        RegistroPractica10 registroPractica10=new RegistroPractica10(getDriver());
        AccountPractica10 accountPractica10=new AccountPractica10(getDriver());
        homePractica10.accedeLogin();
        registroPractica10.registro("Susana","Rios","probandosuuuuu@gmail.com","123456","probando","probando");
        Assert.assertTrue(accountPractica10.validaTitulo("Account"));




    }
}
