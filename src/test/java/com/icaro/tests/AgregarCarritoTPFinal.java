package com.icaro.tests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class AgregarCarritoTPFinal {
    private By agregacamara=By.xpath("(//button[contains(., 'Add to Cart')])[1]");
    private By selecciona=By.xpath("//select[@id='input-option226']/option[@value='15']\n");
    private By botoncarro=By.id("button-cart");
    private WebDriver driver;
    private WebDriverWait wait;

    public AgregarCarritoTPFinal(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void agrega(){
        WebElement agregaCam= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(., 'Add to Cart')])[1]")));
        agregaCam.click();
        WebElement eligeselect= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='input-option226']/option[@value='15']\n")));
        eligeselect.click();
        WebElement botoncarrito= wait.until(ExpectedConditions.elementToBeClickable(By.id("button-cart")));
        botoncarrito.click();

    }
}
