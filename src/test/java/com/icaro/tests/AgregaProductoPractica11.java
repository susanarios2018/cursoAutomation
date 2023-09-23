package com.icaro.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AgregaProductoPractica11 {
    private By agregaheart=By.xpath("//*[@onclick=\"wishlist.add('30');\"]");
    private By heart=By.xpath("//*[@id=\"wishlist-total\"]");
    private WebDriver driver;
    private WebDriverWait wait;

    public AgregaProductoPractica11(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void favorito(){
        WebElement heartBoton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@onclick=\"wishlist.add('30');\"]")));
        heartBoton.click();
        WebElement heartlist= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"wishlist-total\"]")));
        heartlist.click();
    }
}
