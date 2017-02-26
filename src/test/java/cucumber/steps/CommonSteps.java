package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.pages.CommonPage;
import cucumber.pages.Homepage;
import cucumber.support.Hooks;
import org.junit.After;

/**
 * Created by Colin on 2/25/2017.
 */
public class CommonSteps {
    private CommonPage commonPage;

    public CommonSteps(Hooks hooks) {
        commonPage = new CommonPage(hooks.getDriver());
    }

    @Then("^I navigate to page \"([^\"]*)\"$")
    public void i_navigate_to_page(String pageUrl)
    {
        try {
            Thread.sleep(2000);
            commonPage.VerifyUrl(pageUrl);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}