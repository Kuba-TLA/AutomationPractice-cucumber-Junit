import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/rerun-failed.html",
                "rerun:target/failed-scenarios/rerun-failed.txt"},
        features = "@target/failed-scenarios/rerun-failed.txt",
        glue = {"steps"}
)
public class RunFailedScenarios {
}
