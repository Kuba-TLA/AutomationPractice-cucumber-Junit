package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

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
}
