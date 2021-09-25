package steps;

import impl.DatabaseImpl;
import io.cucumber.java.en.And;
import utils.SeleniumUtils;

public class DatabaseSteps {
    DatabaseImpl impl = new DatabaseImpl();

    @And("I click on {string} button")
    public void iClickOnButton(String buttonName) {
        switch (buttonName.toLowerCase()){
            case "access db": impl.getUserMgtPage().accessDbBtn.click();
            break;
            case "login": impl.getUserMgtPage().loginBtn.click();
            break;
            default:
                System.out.println("button was not found");
        }
        SeleniumUtils.switchToNextWindow();
    }
}
