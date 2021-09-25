package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import java.util.List;

public class UserMgtPage {
    public UserMgtPage(){
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(linkText = "User-Mgt")
    public WebElement userMgtLink;

    @FindBy(xpath = "//button/a[text()='Access DB']")
    public WebElement accessDbBtn;

    @FindBy(xpath = "//button/a[text()='Login']")
    public WebElement loginBtn;

    @FindBy(id = "Firstname")
    public WebElement firstNameInput;

    @FindBy(id = "Lastname")
    public WebElement lastNameInput;

    @FindBy(id = "Phonenumber")
    public WebElement phoneInput;

    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(id = "Select-role")
    public WebElement selectRole;

    @FindBy(id = "submit-btn")
    public WebElement submitBtn;

    @FindBy(xpath = "//table[@id='list-table']/tbody/tr")
    public List<WebElement> userTableRows;
}
