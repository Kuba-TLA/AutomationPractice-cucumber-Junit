package impl;

import pages.HomePage;
import utils.ConfigReader;
import utils.WebDriverUtils;


public class HomeImpl {
    HomePage page;

    public HomePage getPage(){
        if(page == null)
            page = new HomePage();
        return page;
    }

    public void navigateToHomepage(){
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }

    public void openLinkInNewWindowAndSwitch(String linkText){
        switch (linkText.toLowerCase()){
            case "saucedemo": getPage().sauceDemoLink.click();
                break;
            case "e-commerce": getPage().ecommerceLink.click();
                break;
            case "shopping cart": getPage().shoppingCartLink.click();
                break;
            default:
                System.out.println("Invalid link text");
        }

        for(String eachWindow: WebDriverUtils.getDriver().getWindowHandles()){
            if(!eachWindow.equals(WebDriverUtils.getDriver().getWindowHandle()))
                WebDriverUtils.getDriver().switchTo().window(eachWindow);
        }
    }

    public String getLinkText(String linkText){
        String actualText = "";
        switch (linkText.toLowerCase()){
            case "saucedemo": actualText = getPage().sauceDemoLink.getText();
            break;
            case "e-commerce": actualText = getPage().ecommerceLink.getText();
            break;
            case "shopping cart": actualText = getPage().shoppingCartLink.getText();
            break;
            case "php travels": actualText = getPage().phpTravelsLink.getText();
            break;
            default:
                System.out.println("link text was not found...");
        }

        return actualText;
    }


}
