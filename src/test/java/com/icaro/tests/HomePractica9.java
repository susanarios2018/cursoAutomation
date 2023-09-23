package com.icaro.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePractica9 {
    private WebDriver driver;
    private WebDriverWait wait;



    public HomePractica9(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void accedeLogin(){
        WebElement account= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class=\"dropdown\"]//span[@class=\"hidden-xs hidden-sm hidden-md\"]")));
        account.click();
        WebElement singin= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"dropdown-menu dropdown-menu-right\"]/child::li[2]")));
        singin.click();
    }

    }




