package cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Colin on 2/25/2017.
 */
public class TapStrategyPage {
    private WebDriver driver;

    public TapStrategyPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public void checkHeader(String headerTitle)
    {
        Assert.assertEquals(headerTitle, header.getText());
    }

    //------------------------------------------ Web Element Declarations-----------------------------------------------
    @FindBy(className = "fusion-page-title-captions")
    private WebElement header;
}
