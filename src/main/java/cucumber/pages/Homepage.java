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

    public void clickHeaderDropdown(String headerElement, String dropdownElement)
    {
        WebElement hover = Helper.HeadersHover(hoverElements, headerElement);
        this.waitForElement(hover, 10);

        Actions action = new Actions(driver);
        action.moveToElement(hover);
        action.perform();

        switch (dropdownElement)
        {
            case "Strategy":
                tapStrategy.click();
                break;
            case "Automation":
                tapAutomation.click();
                break;
            case "Consulting":
                tapConsulting.click();
                break;
            case "Lakeshore":
                tapLakeshore.click();
                break;
        }

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

    @FindBy(how= How.XPATH,using="//*[@id=\"post-1831\"]/div/div[1]/div/div[3]/div/div[1]/a[1]")
    private WebElement strategyBtn;

    @FindBy(how= How.XPATH,using="//*[@id=\"post-1831\"]/div/div[1]/div/div[3]/div/div[1]/a[2]")
    private WebElement continuousBtn;

    @FindBy(how= How.XPATH,using="//*[@id=\"post-1831\"]/div/div[1]/div/div[3]/div/div[1]/a[3]")
    private WebElement ensuringBtn;

    @FindBy(how= How.XPATH,using="//*[@id=\"post-1831\"]/div/div[1]/div/div[3]/div/div[1]/a[4]")
    private WebElement solutionBtn;

    @FindBy(className="menu-text")
    private List<WebElement> hoverElements;

    @FindBy(how= How.ID,using="menu-item-1868")
    private WebElement tapStrategy;

    @FindBy(how= How.ID,using="menu-item-1869")
    private WebElement tapAutomation;

    @FindBy(how= How.ID,using="menu-item-1870")
    private WebElement tapConsulting;

    @FindBy(how= How.ID,using="menu-item-1871")
    private WebElement tapLakeshore;

    @FindBy(how= How.XPATH,using="//*[@id=\"post-1831\"]/div/div[5]/div/div[2]/div/p/a/img")
    private WebElement video;

    @FindBy(how= How.CLASS_NAME,using="ilightbox-holder")
    private WebElement vidContainer;

}
