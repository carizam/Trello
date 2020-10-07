package Helpers;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    private static WebDriver driver;

    public Browser() {

    }

    public static WebDriver getDriver(){
        return driver;
    }

    @Before
    public void chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cariza\\IdeaProjects\\Trello\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://trello.com/");

    }
    @After
    public void tearDown() {

        driver.quit();

    }
}
