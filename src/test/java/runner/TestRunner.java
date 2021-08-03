package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue={"steps"},
        tags={"@Login"},
        plugin = {"pretty", "html:target/cucumber-reports",
                "json:target/cucumber-reports/CucumberTestReport.json"},
        dryRun = false

)
public class TestRunner {


}
