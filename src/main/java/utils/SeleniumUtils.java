package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class SeleniumUtils {

    /**
     * This method will handle switching form one window to another.
     * NOTE: method handles only 2 windows at a time.
     */
    public static void switchToNextWindow(){
        String currentWindow = WebDriverUtils.getDriver().getWindowHandle();
        Set<String> allWindows = WebDriverUtils.getDriver().getWindowHandles();

        for(String each: allWindows){
            if(!each.equals(currentWindow)){
                WebDriverUtils.getDriver().switchTo().window(each);
            }
        }
    }

    public static void selectByVisibleText(WebElement element, String textValue){
        Select select = new Select(element);
        select.selectByVisibleText(textValue);
    }
}
