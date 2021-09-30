package steps;

import impl.LoginImpl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import utils.WebDriverUtils;

public class LoginSteps implements CommonPage {
    LoginImpl impl = new LoginImpl();

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
}
