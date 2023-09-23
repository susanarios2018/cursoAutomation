package com.icaro.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class InicioTest {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        ChromeOptions options=new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","C:/Users/exc52732/Desktop/workspace/chromedriver/chromedriver.exe");
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.setPageLoadTimeout(Duration.ofSeconds(60));
        this.driver=new ChromeDriver(options);


    }
    @Test
    public void ingresar(){

        this.driver.get(" http://www.automationpractice.pl/index.php?");
    }
    @Test
    public void iniciarSesion(){
        WebElement singin= driver.findElement(By.xpath("//*[@class='login']"));
        singin.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // espera 10 segundos
        WebElement loginElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("login")));
        try {
            Thread.sleep(5000); // Pausa de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void validarHome(){
        WebElement logo= driver.findElement(By.xpath("//*[@title=\"My Shop\"]"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // espera 10 segundos
        WebElement logoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("logo")));
        Assert.assertTrue(logo.isDisplayed());
        WebElement busqueda= driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
        busqueda.click();
        busqueda.sendKeys("shoes");
        WebElement Botonbusqueda= driver.findElement(By.xpath("//*[@class=\"btn btn-default button-search\"]"));
        Botonbusqueda.click();

        }



    @AfterTest
    public void cerrar(){
        if (this.driver!=null){
            this.driver.quit();
        }

    }

}
