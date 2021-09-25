package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class HomePage {
    public HomePage (){
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(linkText = "Saucedemo")
    public WebElement sauceDemoLink;

    @FindBy(linkText = "E-commerce")
    public WebElement ecommerceLink;

    @FindBy(linkText = "Shopping Cart")
    public WebElement shoppingCartLink;

    @FindBy(linkText = "PHP Travels")
    public WebElement phpTravelsLink;
}
