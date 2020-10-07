package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Methods {

    protected WebDriver driver;

    public Methods(WebDriver driver) {

        this.driver = driver;
    }

    public void type(String inputText, By locator) {

        driver.findElement(locator).sendKeys(inputText);

    }

    public void click (By locator) {

        driver.findElement(locator).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
