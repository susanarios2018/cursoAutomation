package com.icaro.tests;

import com.icaro.Persona;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class PersonasTest {
    @Test
    public void validarNombre(){
        Persona persona=new Persona("Susi","Rios", 35);
        Assert.assertEquals(persona.getNombre(),"Susi");

    }
    @Test
    public void validarNombreIncorrecto(){
        Persona persona=new Persona("Susi","Rios", 35);
        Assert.assertNotEquals(persona.getNombre(),"Su");

    }
    @Test
    public void validarSaludo(){
        Persona persona=new Persona("Susi","Rios", 35);
        Assert.assertTrue(Objects.equals(persona.saludo(), "Probando ando"));


    }
}
