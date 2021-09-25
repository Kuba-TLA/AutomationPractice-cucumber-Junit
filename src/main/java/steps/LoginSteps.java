package steps;

import impl.DatabaseImpl;
import impl.LoginImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

public class LoginSteps {
    LoginImpl impl = new LoginImpl();

    @And("I click on Login button")
    public void iClickOnAccessDBButton() {
        impl.getUserMgtPage().loginBtn.click();
        SeleniumUtils.switchToNextWindow();
    }

    @Then("Title of the page should be Login Page")
    public void titleOfThePageShouldBeUserDB() {
        Assert.assertEquals("Login Page", WebDriverUtils.getDriver().getTitle());
    }

    @Then("Image of TLA logo is displayed")
    public void imageOfTLALogoIsDisplayed() {
        String imgSrc = impl.getPage().tlaLogo.getAttribute("src");
        Assert.assertTrue(imgSrc.contains("logo.jpeg"));
    }
}
