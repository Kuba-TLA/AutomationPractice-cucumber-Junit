import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/databaseRunner.html",
        "rerun:target/failed-scenarios/database.txt"},
        features = "src/main/resources/features/database.feature",
        glue = {"steps"},
        stepNotifications = true
)
public class DatabaseRunner {
}
