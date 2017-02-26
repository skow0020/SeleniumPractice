package cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Colin on 2/24/2017.
 */
public class CommonPage {
    private WebDriver driver;

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

    @FindBy(className = "fusion-logo-link")
    public WebElement logo;

}
