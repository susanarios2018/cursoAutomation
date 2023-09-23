package com.icaro.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CamerasPractica11 {
    private By camera = By.xpath("//*[@id=\"menu\"]//li[7]");
    private WebDriver driver;
    private WebDriverWait wait;

    public CamerasPractica11(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void camara(){
        WebElement CameraBoton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu\"]//li[7]")));
        CameraBoton.click();


    }
}
