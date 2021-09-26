import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/homeRunner.html",
        "rerun:target/failed-scenarios/homeRunner.txt"},
        features = "src/main/resources/features/home.feature",
        glue = {"steps"},
        stepNotifications = true,
        tags = "@scenarioOutline"
)
public class HomeRunner {
}
