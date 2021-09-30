package steps;

import impl.InputsImpl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class InputsSteps {
    InputsImpl impl = new InputsImpl();

    @When("I open {string} page")
    public void iOpenPage(String navBtnText) {
        switch (navBtnText.toLowerCase()){
            case "inputs": impl.getPage().inputsLinkText.click();
            break;
            case "user-mgt": impl.getUserMgtPage().userMgtLink.click();
            break;
            default:
                System.out.println("Link text is not found");
        }
    }

    @When("I input {string} as {string} in Inputs page")
    public void iInputAsInInputsPage(String fieldName, String value) {
        impl.fillInputFieldInputsPage(fieldName, value);
    }

    @When("I input following details in Inputs page form")
    public void iInputFollowingDetailsInInputsPageForm(Map<String, String> fields) {
        for(String key: fields.keySet()){
            impl.fillInputFieldInputsPage(key, fields.get(key));
        }
    }

    @Then("I should be able to see text with value {string}")
    public void iShouldBeAbleToSeeTextWithValue(String msg) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Thanks for contacting us, we will get back to you shortly.",
                impl.getPage().formConfirmationText.getText());
    }

}
