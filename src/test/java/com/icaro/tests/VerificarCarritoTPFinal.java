package com.icaro.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class VerificarCarritoTPFinal {
    private WebDriver driver;
    private WebDriverWait wait;
    private By titulocamara = By.xpath("//*[@id=\"checkout-cart\"]//*[@class=\"text-left\"]/a");
    public VerificarCarritoTPFinal(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public boolean validaTitulo(String tituloEsperado) {

        return  this.wait.until(ExpectedConditions.textToBe(titulocamara,tituloEsperado));

    }

}
