
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "json:target/cucumber-report.json", "junit:target/cucumber.xml", "rerun:target/rerun.txt"},
        features = {"src/test/resources/smoke.feature"},
        glue = {"stepdefinitions"}
)
public class RunnerTests {
}