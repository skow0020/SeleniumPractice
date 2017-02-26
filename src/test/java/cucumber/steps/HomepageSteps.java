package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.pages.CommonPage;
import cucumber.pages.Homepage;
import cucumber.support.Hooks;


/**
 * Created by Colin on 2/24/2017.
 */
public class HomepageSteps {
    private Homepage page;
    private CommonPage commonPage;

    public HomepageSteps(Hooks hooks) {

        page = new Homepage(hooks.getDriver());
        commonPage = new CommonPage(hooks.getDriver());
    }

    @Given("^I am on \"(.*?)\"$")
    public void iAmOn(String url) throws Throwable {
        page.goTo(url);
        commonPage.VerifyUrl(url);
    }

    @Then("^I see the header$")
    public void iSeeTheHeader(String content) throws Throwable {
        page.checkHeader(content);
    }

    @When("^I click the logo$")
    public void iClickTheLogo() throws Throwable {
        commonPage.logo.click();
    }

    @When("^I click the strategy link$")
    public void iClickTheStrategyLink() throws Throwable {
        page.clickStrategy();
    }

    @When("^I click the CI link$")
    public void iClickTheCILink() throws Throwable {
        page.clickCI();
    }

    @When("^I click the ensuring link$")
    public void iClickTheEnsuringLink() throws Throwable {
        page.clickEnsuring();
    }

    @When("^I click the solution link$")
    public void iClickTheSolutionLink() throws Throwable {
        page.clickSolution();
    }
}
