package com.icaro.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPractica9 {
    private By email = By.id("input-email");
    private By pass = By.id("input-password");
    private By signinBoton = By.xpath("//input[@class=\"btn btn-primary\"]");
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPractica9(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void login(String email, String pass){
        WebElement emailInput= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-email")));
        emailInput.sendKeys(email);
        WebElement passInput= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-password")));
        passInput.sendKeys(pass);
        WebElement singinBotonInput= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class=\"btn btn-primary\"]")));
        singinBotonInput.click();
    }
}
