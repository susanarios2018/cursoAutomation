package com.icaro.tests.stepDefinitions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;


public class RegistroDefinitions {
    @Dado("Estoy en la página de inicio")
    public void EstoyEnLaPAginaDeInicio(){
        System.out.println("Step DADO");
    }
    @Cuando("Hago clic en Iniciar Sesión")
    public void HagoClickEnIniciarSesion() {
        System.out.println("Step CUANDO");

    }
    @Y("Lleno el formulario de registro con los siguientes datos:")
    @Y("Acepto los términos y condiciones")
    @Y("Hago clic en \"Continuar\"")



    @Entonces("Debería ver la página de cuenta con el título \"Account\"")
    public void DeberiaVErLaPAginaConELTituloAccount () {
        System.out.println("Step ENTONCES");
    }

}
