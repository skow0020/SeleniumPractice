package cucumber.support;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hooks {

    private WebDriver driver;
    private String driverType = (System.getProperty("environment") == null) ? "chrome" : System.getProperty("environment");

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        if (driverType.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (driverType.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "C:/webdrivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (driverType.equals("explorer"))
        {
            System.setProperty("webdriver.ie.driver", "C:/webdrivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
    }

//    @Before("@chrome")
//    public void beforeChrome()
//    {
//        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
//        driver = new ChromeDriver();
//    }
//    @Before("@firefox")
//    public void Firefox()
//    {
//        System.setProperty("webdriver.gecko.driver", "C:/webdrivers/geckodriver.exe");
//        driver = new FirefoxDriver();
//    }
//    @Before("@explorer")
//    public void beforeExplorer()
//    {
//        System.setProperty("webdriver.ie.driver", "C:/webdrivers/IEDriverServer.exe");
//        driver = new InternetExplorerDriver();
//    }


    @After
    public void afterScenario(Scenario scenario) {
        driver.quit();
    }
}