package com.icaro.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VerCarritoTPFinal {
    private By consulta=By.id("cart-total");
    private By viewcart=By.xpath("//*[@class=\"text-right\"]//*[@class=\"fa fa-shopping-cart\"]");

    private WebDriver driver;
    private WebDriverWait wait;

    public VerCarritoTPFinal(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void consultaCarrito(){
        WebElement consCarro= wait.until(ExpectedConditions.elementToBeClickable(By.id("cart-total")));
        consCarro.click();
        WebElement vercarro= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"text-right\"]//*[@class=\"fa fa-shopping-cart\"]")));
        vercarro.click();



    }
}
