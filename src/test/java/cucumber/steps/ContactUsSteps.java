package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.pages.CommonPage;
import cucumber.pages.ContactUsPage;
import cucumber.pages.TapStrategyPage;
import cucumber.support.Hooks;
import org.junit.Assert;

/**
 * Created by Colin on 2/28/2017.
 */
public class ContactUsSteps {
    private ContactUsPage page;
    private CommonPage commonPage;

    public ContactUsSteps(Hooks hooks) {

        page = new ContactUsPage(hooks.getDriver());
        commonPage = new CommonPage(hooks.getDriver());
    }

    @Then("^I see the contact us header$")
    public void iSeeTheContactUsHeader(String header) throws Throwable {
        page.checkHeader(header);
    }

    @Then("^I can contact tapqa$")
    public void iCanContactTapqa() throws Throwable {
        Assert.assertTrue(true);
    }

    @When("^I add \"([^\"]*)\" \"([^\"]*)\"$")
    public void iAdd(String field, String text) throws Throwable {
        page.setTextEdit(field, text);
    }
}
