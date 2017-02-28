package cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.pages.CommonPage;
import cucumber.pages.TapStrategyPage;
import cucumber.support.Hooks;

/**
 * Created by Colin on 2/26/2017.
 */
public class TapStrategySteps {
    private TapStrategyPage page;
    private CommonPage commonPage;

    public TapStrategySteps(Hooks hooks) {

        page = new TapStrategyPage(hooks.getDriver());
        commonPage = new CommonPage(hooks.getDriver());
    }

    @Then("^I see the strategy header$")
    public void iSeeTheStrategyHeader(String header) throws Throwable {
        page.checkHeader(header);
    }
}
