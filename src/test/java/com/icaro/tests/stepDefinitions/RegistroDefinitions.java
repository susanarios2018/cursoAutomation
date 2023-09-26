package com.icaro.tests.stepDefinitions;
import com.icaro.tests.*;
import com.icaro.tests.Hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;


public class RegistroDefinitions {
    private HomePractica9 homePractica9;
    private HomePractica10 homePractica10;
    @Dado("Que el usuario ingresa al Register de la pagina opencart")
    public void ElUsuarioEntraRegister(){
        HomePractica9 homePractica9=new HomePractica9(Hooks.getDriver());
        homePractica9.ingresaPagina("https://opencart.abstracta.us");
        HomePractica10 homePractica10=new HomePractica10(Hooks.getDriver());
        homePractica10.accedeLogin();
        System.out.println("Ingresa a registrarse");
    }
    @Cuando("El usuario completa el formulario")
    public void ElUsuarioCompletaFormulario() {
        RegistroPractica10 registroPractica10=new RegistroPractica10(Hooks.getDriver());
        registroPractica10.registro("Susana","Rios","probandosuuuuu@gmail.com","123456","probando","probando");
        System.out.println("Completa el formulario");

    }
    @Entonces("Verifica creacion de cuenta con el título \"Account\"")
    public void DeberiaVErLaPAginaConELTituloAccount () {
        AccountPractica10 accountPractica10= new AccountPractica10(Hooks.getDriver());
        Assert.assertTrue(accountPractica10.validaTitulo("Account"));
        System.out.println("Valida la creacion de cuenta");
    }

}
