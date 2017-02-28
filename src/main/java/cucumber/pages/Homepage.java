package cucumber.pages;
import cucumber.helpers.Helpers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Colin on 2/24/2017.
 */
public class Homepage {
    private WebDriver driver;
    private Helpers Helper = new Helpers();

    public Homepage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public void goTo(String url) {
        driver.navigate().to(url);
    }

    public void checkHeader(String content) {
        Assert.assertEquals(content, header.getText());
    }

    public void clickStrategy(){ strategyBtn.click(); }

    public void clickCI(){
        continuousBtn.click();
    }

    public void clickEnsuring(){
        ensuringBtn.click();
    }

    public void clickSolution(){
        solutionBtn.click();
    }

    public void clickVideo() { video.click(); }

    public void verifyVideo()
    {
        this.waitForElement(vidContainer, 10);
        Assert.assertTrue(vidContainer.isDisplayed());
        vidContainer.click();
    }

    //------------------------------------------ Utility Functions -----------------------------------------------
    private void waitForElement(WebElement element, int timeout)
    {
        WebDriverWait wait = new WebDriverWait(this.driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //------------------------------------------ Web Element Declarations-----------------------------------------------
    @FindBy(css = ".fusion-column-wrapper i")
    private WebElement header;

    @FindBy(how= How.PARTIAL_LINK_TEXT,using="Strategy for Scaling")
    private WebElement strategyBtn;

    @FindBy(how= How.PARTIAL_LINK_TEXT,using="Continuous Integration, ")
    private WebElement continuousBtn;

    @FindBy(how= How.PARTIAL_LINK_TEXT,using="Ensuring Quality ")
    private WebElement ensuringBtn;

    @FindBy(how= How.PARTIAL_LINK_TEXT,using="I Need a Nearshore")
    private WebElement solutionBtn;

    @FindBy(how= How.CLASS_NAME,using="attachment-post-thumbnail")
    private WebElement video;

    @FindBy(how= How.CLASS_NAME,using="ilightbox-holder")
    private WebElement vidContainer;

}
