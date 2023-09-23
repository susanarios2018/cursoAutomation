package com.icaro.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistroPractica10 {
    private By firstname = By.id("input-firstname");
    private By lastname = By.id("input-lastname");
    private By email = By.id("input-email");
    private By telephone = By.id("input-telephone");
    private By password = By.id("input-password");
    private By confirmapass = By.id("input-confirm");
    private By check = By.xpath("//*[@name=\"agree\"]");
    private By continueBoton = By.xpath("//input[@class=\"btn btn-primary\"]");
    private WebDriver driver;
    private WebDriverWait wait;


    public RegistroPractica10(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void registro(String nombre,String apellido,String email,String telefono, String pass, String confirmpass){
        WebElement firstInput= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-firstname")));
        firstInput.sendKeys(nombre);
        WebElement lastInput= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-lastname")));
        lastInput.sendKeys(apellido);
        WebElement emailInput= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-email")));
        emailInput.sendKeys(email);
        WebElement telInput= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-telephone")));
        telInput.sendKeys(telefono);
        WebElement passInput= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-password")));
        passInput.sendKeys(pass);
        WebElement confirma= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-confirm")));
        confirma.sendKeys(confirmpass);
        WebElement agree= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"agree\"]")));
        agree.click();
        WebElement continua= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class=\"btn btn-primary\"]")));
        continua.click();
    }
}
