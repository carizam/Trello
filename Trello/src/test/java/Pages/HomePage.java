package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {

        super(driver);

    }

    @FindBy(linkText = "/login")
    private WebElement Login;

    public void gotologinpage() {
        driver.findElement((By) Login).click();
    }
}


