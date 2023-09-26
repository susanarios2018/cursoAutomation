package com.icaro.tests.Hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class Hooks {
    private static WebDriver driver;
    private WebDriverWait wait;
    @Before
    public void setup(Scenario scenario){
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:/Users/exc52732/Desktop/workspace/chromedriver/chromedriver.exe");
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.setPageLoadTimeout(Duration.ofSeconds(60));
        driver = new ChromeDriver(options);
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
        options.addArguments("--ignore-certificate-errors");

    }
    public static WebDriver getDriver(){
        return driver;
    }
    @After
    public void cerrar() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}
