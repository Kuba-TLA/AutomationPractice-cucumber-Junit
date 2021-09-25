import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cukesRunner.html",
        "rerun:target/failed-scenarios/cukes.txt"},
        features = "src/main/resources/features",
        glue = {"steps"},
        stepNotifications = true
)
public class CukesRunner {
}
