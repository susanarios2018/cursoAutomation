package com.icaro.tests.stepDefinitions;
import com.icaro.tests.*;
import com.icaro.tests.Hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;


public class FavoritoDefinitions {
    private HomePractica9 homePractica9;
    private LoginPractica9 loginPractica9;
    private LoginTestPractica9 loginTestPractica9;

    @Dado("Que el usuario se loguea en la pagina opencart")
    public void SeLoguea() {

        HomePractica9 homePractica9 = new HomePractica9(Hooks.getDriver());
        homePractica9.ingresaPagina("https://opencart.abstracta.us");
        homePractica9.accedeLogin();
        LoginPractica9 loginPractica9 = new LoginPractica9(Hooks.getDriver());
        loginPractica9.login("susanarios2011@gmail.com","probando");
}
    @Cuando("El usuario se encuentra en la solapa cameras")
    public void ElUsuarioAccedeCameras() {
        CamerasPractica11 camerasPractica11=new CamerasPractica11(Hooks.getDriver());
        camerasPractica11.camara();
        System.out.println("Accede a camaras");

    }
    @Entonces("Selecciona la camara a favoritos")
    public void SeleccionaFavorito () {
        AgregaProductoPractica11 agregaProductoPractica11=new AgregaProductoPractica11(Hooks.getDriver());
        agregaProductoPractica11.favorito();
        System.out.println("Valida la creacion de cuenta");
    }
    @Y("Valida el titulo de la camara")
    public void VisualizaCamara(){
        validaFavPractica11 validaFavPractica11=new validaFavPractica11(Hooks.getDriver());

        Assert.assertTrue(validaFavPractica11.validaTitulo("Canon EOS 5D"));

    }

}
