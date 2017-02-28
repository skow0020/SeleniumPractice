package cucumber.pages;

import cucumber.helpers.Helpers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Colin on 2/24/2017.
 */
public class CommonPage {
    private WebDriver driver;
    private Helpers Helper = new Helpers();

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo(String url) {
        driver.navigate().to(url);
    }

    public String GetUrl()
    {
        return this.driver.getCurrentUrl();
    }

    public void VerifyUrl(String url) {
        Assert.assertEquals(url, GetUrl());
    }

    private void waitForElement(WebElement element, int timeout)
    {
        WebDriverWait wait = new WebDriverWait(this.driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
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
            case "Leadership":
                tapLeadership.click();
                break;
            case "News":
                tapNews.click();
                break;
        }
    }

    //------------------------------------------ Web Element Declarations-----------------------------------------------
    @FindBy(className = "fusion-logo-link")
    public WebElement logo;

    @FindBy(how= How.ID,using="menu-item-1868")
    private WebElement tapStrategy;

    @FindBy(how= How.ID,using="menu-item-1869")
    private WebElement tapAutomation;

    @FindBy(how= How.ID,using="menu-item-1870")
    private WebElement tapConsulting;

    @FindBy(how= How.ID,using="menu-item-1871")
    private WebElement tapLakeshore;

    @FindBy(how= How.ID,using="menu-item-25")
    private WebElement tapLeadership;

    @FindBy(how= How.ID,using="menu-item-2018")
    private WebElement tapNews;

    @FindBy(className="menu-text")
    private List<WebElement> hoverElements;
}
