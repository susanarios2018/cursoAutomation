package com.icaro.tests;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyAccountPractica9 {
    private WebDriver driver;
    private WebDriverWait wait;
    private By titulo = By.xpath("//h2[text()='My Account']");
    public MyAccountPractica9(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("content")));
    }
    public boolean validaTitulo(String tituloEsperado) {
        try {
            return this.wait.until(ExpectedConditions.presenceOfElementLocated(titulo)).isDisplayed();
        } catch (TimeoutException e) {
            System.out.println("Error: No se encontró el título esperado.");
            return false;
        }

        //return  this.wait.until(ExpectedConditions.textToBe(titulo,tituloEsperado));


    }
}
