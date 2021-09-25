package steps;

import impl.DatabaseImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

public class DatabaseSteps {
    DatabaseImpl impl = new DatabaseImpl();

    @And("I click on Access DB button")
    public void iClickOnAccessDBButton() {
        impl.getUserMgtPage().accessDbBtn.click();
    }

    @Then("Title of the page should be User DB")
    public void titleOfThePageShouldBeUserDB() {
        SeleniumUtils.switchToNextWindow();
        Assert.assertEquals("User DB", WebDriverUtils.getDriver().getTitle());
    }
}
