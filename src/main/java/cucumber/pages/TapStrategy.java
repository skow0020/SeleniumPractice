package cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Colin on 2/25/2017.
 */
public class TapStrategy {
    private WebDriver driver;

    public TapStrategy(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public void checkHeader(String headerTitle)
    {
        String x = header.getText();
        Assert.assertEquals(headerTitle, header.getText());
    }

    //------------------------------------------ Web Element Declarations-----------------------------------------------
    @FindBy(className = "fusion-page-title-captions")
    private WebElement header;
}
