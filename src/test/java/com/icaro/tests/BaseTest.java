package com.icaro.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;

    public static WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:/Users/exc52732/Desktop/workspace/chromedriver/chromedriver.exe");
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.setPageLoadTimeout(Duration.ofSeconds(60));
        this.driver = new ChromeDriver(options);
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));


    }

    @AfterTest
    public void cerrar() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}