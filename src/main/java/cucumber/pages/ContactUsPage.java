package cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Colin on 2/28/2017.
 */
public class ContactUsPage {
    private WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public void checkHeader(String headerTitle)
    {
        Assert.assertEquals(headerTitle, header.getText());
    }

    public void setTextEdit(String field, String text)
    {
        switch (field)
        {
            case "name":
                nameInput.sendKeys(text);
                break;
            case "email":
                emailInput.sendKeys(text);
                break;
            case "phone":
                phoneInput.sendKeys(text);
                break;
            case "how I heard":
                Select select = new Select(hearAboutUs);
                select.selectByVisibleText(text);
                break;
            case "message":
                nameInput.sendKeys(text);
                break;
            default:
                Assert.fail("Method not implemented for: " + field);
                break;
        }
    }

    //------------------------------------------ Web Element Declarations-----------------------------------------------
    @FindBy(how= How.CLASS_NAME, using="fusion-page-title-captions")
    private WebElement header;

    @FindBy(how= How.NAME, using="input_1")
    private WebElement nameInput;

    @FindBy(how= How.NAME, using="input_2")
    private WebElement emailInput;

    @FindBy(how= How.NAME, using="input_3")
    private WebElement phoneInput;

    @FindBy(how= How.NAME, using="input_5")
    private WebElement hearAboutUs;

    @FindBy(how= How.NAME, using="input_4")
    private WebElement message;

    @FindBy(how= How.CLASS_NAME, using="recaptcha-checkbox-checkmark")
    private WebElement captcha;
}

