package com.icaro.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyAccountPractica9 {
    private WebDriver driver;
    private WebDriverWait wait;
    private By titulo = By.xpath("//*[@id=\"content\"]/h2");
    public MyAccountPractica9(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public boolean validaTitulo(String tituloEsperado) {

               return  this.wait.until(ExpectedConditions.textToBe(titulo,tituloEsperado));

    }
}
