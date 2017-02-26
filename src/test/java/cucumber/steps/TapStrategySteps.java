package cucumber.steps;

import cucumber.pages.CommonPage;
import cucumber.pages.Homepage;
import cucumber.pages.TapStrategy;
import cucumber.support.Hooks;

/**
 * Created by Colin on 2/26/2017.
 */
public class TapStrategySteps {
    private TapStrategy page;
    private CommonPage commonPage;

    public TapStrategySteps(Hooks hooks) {

        page = new TapStrategy(hooks.getDriver());
        commonPage = new CommonPage(hooks.getDriver());
    }


}
