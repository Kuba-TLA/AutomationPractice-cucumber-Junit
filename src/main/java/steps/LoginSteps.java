package steps;

import impl.LoginImpl;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pojos.Credentials;
import utils.WebDriverUtils;

import java.util.List;
import java.util.Map;

public class LoginSteps implements CommonPage {
    LoginImpl impl = new LoginImpl();

    @DataTableType
    public Credentials registerUser(Map<String, String> entry){
        return new Credentials(
                entry.get("username"),
                entry.get("password")
        );
    }

    @Then("Image {string} should have value {string}")
    public void imageShouldHaveValue(String imgName, String expectedImgValue) {
        String actualImgSrc = impl.getImageSrcValue(imgName);
        Assert.assertTrue(actualImgSrc.contains(expectedImgValue));
    }

    @When("I input {string} as {string} in input field")
    public void iInputAsInInputField(String fieldName, String value) {
        String xpath = "";
        switch (fieldName.toLowerCase()){
            case "username":
                xpath = String.format(XPATH_TEMPLATE_INPUT_BOX, "Enter Username");
                break;
            case "password":
                xpath = String.format(XPATH_TEMPLATE_INPUT_BOX, "Enter Password");
                break;
        }

        WebDriverUtils.getDriver().findElement(By.xpath(xpath)).sendKeys(value);
    }

    @Then("I validate following credentials are login in with no issue:")
    public void iValidateFollowingCredentialsAreLoginInWithNoIssue(List<Credentials> credentials) {
        String xpathUsername = String.format(XPATH_TEMPLATE_INPUT_BOX, "Enter Username");
        String xpathPassword = String.format(XPATH_TEMPLATE_INPUT_BOX, "Enter Password");
        String xpathButton = String.format(XPATH_TEMPLATE_BUTTON, "Login");

        for(Credentials each: credentials){
            WebDriverUtils.getDriver().findElement(By.xpath(xpathUsername)).sendKeys(each.getUsername());
            WebDriverUtils.getDriver().findElement(By.xpath(xpathPassword)).sendKeys(each.getPassword());
            WebDriverUtils.getDriver().findElement(By.xpath(xpathButton)).click();

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebDriverUtils.getDriver().get("http://automation.techleadacademy.io/#/practiceLogin");
            WebDriverUtils.getDriver().navigate().refresh();
        }

    }
}
