package steps;

import impl.HomeImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CucumberLogUtils;
import utils.WebDriverUtils;

public class HomeSteps {
    HomeImpl impl = new HomeImpl();

    @Given("I navigate to homepage")
    public void i_navigate_to_homepage() {
        impl.navigateToHomepage();
    }

    @Then("I should be able to see {string} link text")
    public void iShouldBeAbleToSeeLinkText(String linkText) {
        CucumberLogUtils.logInfo("This is a test message", false);
        String actualText = impl.getLinkText(linkText);
        Assert.assertEquals(linkText, actualText);
    }

    @When("I click {string} link text")
    public void i_click_saucedemo_link_text(String linkText) {
        CucumberLogUtils.logInfo("Clicked Demo button", false);
        impl.openLinkInNewWindowAndSwitch(linkText);
        Assert.fail();
    }

    @Then("Title of the page should be {string}")
    public void i_should_see_swag_labs_title(String expectedTitle) {
        CucumberLogUtils.logInfo("Saucelabs page", false);
        Assert.assertEquals(expectedTitle, WebDriverUtils.getDriver().getTitle());
    }


    @Then("I verify {string} button is enabled")
    public void iVerifyButtonIsEnabled(String btnName) {
        boolean enabled = false;

        switch (btnName.toLowerCase()){
            case "home": enabled = impl.getPage().homeBtn.isEnabled();
                break;
            case "files": enabled = impl.getPage().filesBtn.isEnabled();
                break;
            case "notes": enabled = impl.getPage().notesBtn.isEnabled();
                break;
            case "iframes": enabled = impl.getPage().iframesBtn.isEnabled();
                break;
        }
        Assert.assertTrue(enabled);
    }
}
