package cucumber.support;

import cucumber.api.cli.Main;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//To run from command line:
//mvn clean test -Denv.BROWSER=firefox
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        plugin={"pretty", "html:target/cucumber"},
        glue = {"cucumber.steps",
                "cucumber.support"},
        tags = {})
public class CucumberRunner {

}
