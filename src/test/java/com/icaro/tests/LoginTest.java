package com.icaro.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginTest extends BaseTest{



    @Test
    public void ingresar(){

        this.getDriver().get(" http://www.automationpractice.pl/index.php?");
    }
    @Test
    public void iniciarSesion(){
        PageObject pageObject=new PageObject(getDriver());
        LoginPage loginPage=new LoginPage(getDriver());
        pageObject.accedeLogin();
        loginPage.login("su.daftpunk@hotmail.com","srgt1706");




    }



}


