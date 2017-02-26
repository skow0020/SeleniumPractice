package cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Colin on 2/24/2017.
 */
public class Homepage {
    private WebDriver driver;

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

    public void clickStrategy(){
        strategyBtn.click();
    }

    public void clickCI(){
        continuousBtn.click();
    }

    public void clickEnsuring(){
        ensuringBtn.click();
    }

    public void clickSolution(){
        solutionBtn.click();
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
}
