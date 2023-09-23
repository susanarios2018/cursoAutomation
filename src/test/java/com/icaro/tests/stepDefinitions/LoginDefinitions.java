package com.icaro.tests.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginDefinitions {
    @Dado("Que el usuario ingresa al login de la pagina opencart")
    public void queElUsuarioIngresaAlLoginDeLaPaginaOpencart(){
        System.out.println("Step DADO");
    }
    @Cuando("El usuario ingresa email y contraseña validos")
    public void queElUsuarioIngresaEmailYContrasenaValidos() {
        System.out.println("Step CUANDO");
    }
    @Entonces("El usuario se encuentra en la pantalla de su cuenta")
        public void queElUsuarioSeEncuentraEnLaPantallaDeSuCuenta () {
            System.out.println("Step ENTONCES");
        }
    }