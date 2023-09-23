package com.icaro.tests;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestPractica11 extends BaseTest{
    @Test
    public void ingresar(){

        this.getDriver().get("https://opencart.abstracta.us");
    }
    @Test
    public void iniciarSesion(){
        HomePractica9 homePractica9=new HomePractica9(getDriver());
        LoginPractica9 loginPractica9=new LoginPractica9(getDriver());
        homePractica9.accedeLogin();
        loginPractica9.login("susanarios2011@gmail.com","probando");
        CamerasPractica11 camerasPractica11=new CamerasPractica11(getDriver());
        camerasPractica11.camara();

        AgregaProductoPractica11 agregaProductoPractica11=new AgregaProductoPractica11(getDriver());
        agregaProductoPractica11.favorito();
        validaFavPractica11 validaFavPractica11=new validaFavPractica11(getDriver());

        Assert.assertTrue(validaFavPractica11.validaTitulo("Canon EOS 5D"));




    }
}
