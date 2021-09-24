package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.WebDriverUtils;

public class Hooks {
    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){
        WebDriverUtils.quitDriver();
    }
}
