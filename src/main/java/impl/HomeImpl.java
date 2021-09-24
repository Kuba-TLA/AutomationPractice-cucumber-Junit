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
            default:
                System.out.println("Invalid link text");
        }
    }


}
