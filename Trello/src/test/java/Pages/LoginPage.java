package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {

        super(driver);

    }

    By User = By.id("user");
    By Password = By.id("password-entry");
    By Login = By.id("login");

    public void login(String username, String password) {

        driver.findElement(User).sendKeys(username);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(Login).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
