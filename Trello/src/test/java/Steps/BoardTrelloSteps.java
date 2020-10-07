package Steps;

import Helpers.Browser;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.TrelloMenus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BoardTrelloSteps {

    WebDriver driver;
    Properties properties;


    @Given("The user is logged in trello page")
    public void theUserIsLoggedInTrelloPage() {
        driver = Browser.getDriver();
        HomePage homepage = new HomePage(driver);
        homepage.gotologinpage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(properties.getProperty("userName"),properties.getProperty("pword"));

    }

    @When("The user creates a new board")
    public void theUserCreatesANewBoard() {
        driver = Browser.getDriver();
        TrelloMenus trelloMenus = new TrelloMenus(driver);
        trelloMenus.createBoard();
    }

    @Then("The new board is created")
    public void theNewBoardIsCreated() {
        driver = Browser.getDriver();

    }
}
