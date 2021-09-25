package steps;

import impl.HomeImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.WebDriverUtils;

public class HomeSteps {
    HomeImpl impl = new HomeImpl();

    @Given("I navigate to homepage")
    public void i_navigate_to_homepage() {
        impl.navigateToHomepage();
    }

    @Then("I should be able to see {string} link text")
    public void iShouldBeAbleToSeeLinkText(String linkText) {
        String actualText = impl.getLinkText(linkText);
        Assert.assertEquals(linkText, actualText);
    }

    @When("I click Saucedemo link text")
    public void i_click_saucedemo_link_text() {
        impl.openLinkInNewWindowAndSwitch("Saucedemo");
    }

    @Then("Title of the page should be Swag Labs")
    public void i_should_see_swag_labs_title() {
        Assert.assertEquals("Swag Labs", WebDriverUtils.getDriver().getTitle());
    }


}
