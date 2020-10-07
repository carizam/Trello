package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class TrelloMenus extends BasePage{

    public TrelloMenus(WebDriver driver) {
        super(driver);
    }

    By CreateBoard = By.className("_26muqYrDPZfYnP");
    By AddTitleBoard = By.className("subtle-input");
    By CreateBoardButton =  By.className("button primary");
    By CreateTeamButton = By.className("_33CvMKqfH4Yf0j _3SBHBJq0AAxzqg");
    By EnterNameTeam = By.id("1601997641430-create-team-org-display-name");
    By TeamType = By.className("css-1yqjdp6");
    By ContinueButton = By.className("_3UeOvlU6B5KUnS X1P6DVryq8CYGC _2MgouXHqRQDP_5");
    By TeamMembersBox = By.className("autocomplete-input");
    By InviteToTeam = By.className("autocomplete-btn primary fullWidthButton");

    public void createBoard() {
        driver.findElement(CreateBoard).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(AddTitleBoard).sendKeys("Automation Rules !!");
        driver.findElement(CreateBoardButton);
    }

    public void createTeam(){
        driver.findElement(CreateTeamButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(EnterNameTeam).sendKeys("The Team");
        driver.findElement(TeamType).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(ContinueButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(TeamMembersBox).sendKeys("ciarizam19@gmail.com");
        driver.findElement(InviteToTeam).click();
    }
}
