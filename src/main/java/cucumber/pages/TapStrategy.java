package cucumber.pages;

import org.openqa.selenium.WebDriver;
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
}
