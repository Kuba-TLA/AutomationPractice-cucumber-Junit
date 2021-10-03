import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/loginRunner.html",
        "rerun:target/failed-scenarios/login.txt",
        "json:target/cucumberLoginRunner.json"},
        features = "src/main/resources/features/login.feature",
        glue = {"steps"},
        stepNotifications = true
)
public class LoginRunner {
}
