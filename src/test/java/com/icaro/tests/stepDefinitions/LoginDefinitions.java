package com.icaro.tests.stepDefinitions;

import com.icaro.tests.Hooks.Hooks;
import com.icaro.tests.HomePractica9;
import com.icaro.tests.LoginPractica9;
import com.icaro.tests.LoginTestPractica9;
import com.icaro.tests.MyAccountPractica9;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class LoginDefinitions {
    private HomePractica9 homePractica9;
    private LoginPractica9 loginPractica9;
    private LoginTestPractica9 loginTestPractica9;

    @Dado("Que el usuario ingresa al login de la pagina opencart")
    public void queElUsuarioIngresaAlLoginDeLaPaginaOpencart(){

        HomePractica9 homePractica9=new HomePractica9(Hooks.getDriver());
        homePractica9.ingresaPagina("https://opencart.abstracta.us");
        homePractica9.accedeLogin();
        System.out.println("Abrio la pagina correctamente");
    }
    @Cuando("El usuario ingresa email y contraseña validos")
    public void queElUsuarioIngresaEmailYContrasenaValidos() {
        LoginPractica9 loginPractica9=new LoginPractica9(Hooks.getDriver());
        loginPractica9.login("susanarios2011@gmail.com","probando");
        System.out.println("Se loguea");
    }
    @Entonces("El usuario se encuentra en la pantalla de su cuenta")
    public void queElUsuarioSeEncuentraEnLaPantallaDeSuCuenta () {
        MyAccountPractica9 myAccountPractica9= new MyAccountPractica9(Hooks.getDriver());
        Assert.assertTrue(myAccountPractica9.validaTitulo("My Account"));

            System.out.println("Se encuentra en la pantalla de su cuenta");
        }
    }