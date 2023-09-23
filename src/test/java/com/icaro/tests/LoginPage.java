package com.icaro.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private By email = By.className("email");
    private By pass = By.className("passwd");
    private By signinBoton = By.className("SubmitLogin");
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void login(String email, String pass){
        WebElement emailInput= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        emailInput.sendKeys(email);
        WebElement passInput= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
        passInput.sendKeys(pass);
        WebElement singinBotonInput= wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));
        singinBotonInput.click();
    }
}
