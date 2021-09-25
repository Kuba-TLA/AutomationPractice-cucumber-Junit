package steps;

import impl.LoginImpl;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginSteps {
    LoginImpl impl = new LoginImpl();

    @Then("Image {string} should have value {string}")
    public void imageShouldHaveValue(String imgName, String expectedImgValue) {
        String actualImgSrc = impl.getImageSrcValue(imgName);
        Assert.assertTrue(actualImgSrc.contains(expectedImgValue));
    }
}
