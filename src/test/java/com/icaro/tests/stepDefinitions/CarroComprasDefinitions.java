package com.icaro.tests.stepDefinitions;

import com.icaro.tests.*;
import com.icaro.tests.Hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class CarroComprasDefinitions {
    private HomePractica9 homePractica9;
    private LoginPractica9 loginPractica9;
    private LoginTestPractica9 loginTestPractica9;

    @Dado("Se loguea")
    public void UsuarioSeLoguea() {

        HomePractica9 homePractica9 = new HomePractica9(Hooks.getDriver());
        homePractica9.ingresaPagina("https://opencart.abstracta.us");
        homePractica9.accedeLogin();
        LoginPractica9 loginPractica9 = new LoginPractica9(Hooks.getDriver());
        loginPractica9.login("susanarios2011@gmail.com","probando");
    }
    @Cuando("El usuario accede a la solapa cameras")
    public void UsuarioAccedeCameras() {
        CamerasPractica11 camerasPractica11=new CamerasPractica11(Hooks.getDriver());
        camerasPractica11.camara();
        System.out.println("Accede a solapa camaras");

    }
    @Entonces("Agrega una camara al carro de compras")
    public void AgregaCarroCompras () {
        AgregarCarritoTPFinal agregarCarritoTPFinal = new AgregarCarritoTPFinal(Hooks.getDriver());
        agregarCarritoTPFinal.agrega();
        VerCarritoTPFinal verCarritoTPFinal=new VerCarritoTPFinal(Hooks.getDriver());
        verCarritoTPFinal.consultaCarrito();
        System.out.println("Agrega al carro");
    }
    @Y("Valida el titulo de la camara en el carro de compras")
    public void VisualizaCamaraEnCarro(){
        VerificarCarritoTPFinal verificarCarritoTPFinal=new VerificarCarritoTPFinal(Hooks.getDriver());

        Assert.assertTrue(verificarCarritoTPFinal.validaTitulo("Canon EOS 5D"));
        System.out.println("Valida producto");
    }

}
