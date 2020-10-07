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

public class TeamTrelloSteps {

    WebDriver driver;
    Properties properties;

    @Given("The user is logged in trello")
    public void theUserIsLoggedInTrello() {
        driver = Browser.getDriver();
        HomePage homepage = new HomePage(driver);
        homepage.gotologinpage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(properties.getProperty("userName"),properties.getProperty("pword"));

    }

    @When("The user creates a new Team")
    public void theUserCreatesANewTeam() {
        driver = Browser.getDriver();
        TrelloMenus trelloMenus = new TrelloMenus(driver);
        trelloMenus.createTeam();
        
    }

    @Then("the new Team is created")
    public void theNewTeamIsCreated() {
        driver = Browser.getDriver();

    }
}
