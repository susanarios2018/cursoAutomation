package com.icaro.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PageObject {
    private WebDriver driver;
    private WebDriverWait wait;

    private By title = By.xpath("//*[@class=\"page-heading\"]");
    private By singinBoton = By.id("SubmitLogin");

    public PageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void accedeLogin(){
        WebElement singin= wait.until(ExpectedConditions.elementToBeClickable(By.className("login")));
        singin.click();
    }
    public boolean BusquedaInputVisible(){
        WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(title));
        return element.isDisplayed();
    }
}