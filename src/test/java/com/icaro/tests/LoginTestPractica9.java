package com.icaro.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestPractica9 extends BaseTest{

    @Test
    public void ingresar(){
        this.getDriver().get("https://opencart.abstracta.us");
    }
    @Test
    public void iniciarSesion() {
        HomePractica9 homePractica9 = new HomePractica9(getDriver());
        LoginPractica9 loginPractica9 = new LoginPractica9(getDriver());
        homePractica9.accedeLogin();
        loginPractica9.login("susanarios2011@gmail.com", "probando");

        MyAccountPractica9 myAccountPractica9 = new MyAccountPractica9(getDriver());
        Assert.assertTrue(myAccountPractica9.validaTitulo("My Account"));




    }
}
