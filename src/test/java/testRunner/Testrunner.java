package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://my work//bdd_cucumber//Features//Login.feature",
        glue = "stepDefinitions"
)
public class Testrunner {

}
