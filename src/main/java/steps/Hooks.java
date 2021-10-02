package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CucumberLogUtils;
import utils.WebDriverUtils;

public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        CucumberLogUtils.initScenario(scenario);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed())
            CucumberLogUtils.logFail("Scenario: " + scenario.getName() + " FAILED", true);
//        WebDriverUtils.quitDriver();
    }
}
