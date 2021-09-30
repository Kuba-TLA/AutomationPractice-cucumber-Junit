package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class InputsPage {
    public InputsPage(){
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(linkText = "Inputs")
    public WebElement inputsLinkText;

    @FindBy(name = "first_name")
    public WebElement firstNameInputField;

    @FindBy(name = "last_name")
    public WebElement lastNameInputField;

    @FindBy(name = "email")
    public WebElement emailInputField;

    @FindBy(name = "phone")
    public WebElement phoneInputField;

    @FindBy(name = "address")
    public WebElement addressInputField;

    @FindBy(name = "city")
    public WebElement cityInputField;

    @FindBy(name = "zip")
    public WebElement zipCodeInputField;

    @FindBy(name = "answer3")
    public WebElement formConfirmationText;

    @FindBy(name = "button3")
    public WebElement sendBtn;
}
