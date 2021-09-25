package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.UserMgtPage;
import utils.SeleniumUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMgtImpl {
    private UserMgtPage page;

    public UserMgtPage getPage() {
        if(page == null){
            page = new UserMgtPage();
        }
        return page;
    }

    Map<String, String> userFieldInputsMap = new HashMap<>();

    public void fillInputField(String inputFieldName, String value){
        switch (inputFieldName.toLowerCase()){
            case "firstname": getPage().firstNameInput.sendKeys(value);
                break;
            case "lastname": getPage().lastNameInput.sendKeys(value);
                break;
            case "phone number": getPage().phoneInput.sendKeys(value);
                break;
            case "email": getPage().emailInput.sendKeys(value);
                break;
            case "role":
                SeleniumUtils.selectByVisibleText(getPage().selectRole, value);
                break;
            default:
                System.out.println("Field name was not found...");
        }

        userFieldInputsMap.put(inputFieldName, value);
    }

    public String verifyEachUserFields(){
        String result = "success";

        List<WebElement> allCells = getPage().userTableRows.get(0).findElements(By.xpath(".//td"));
        for(String eachField: userFieldInputsMap.keySet()){
            boolean missing = true;
            for(int i = 0; i < allCells.size(); i++){
                if(allCells.get(i).getText().equals(eachField)){
                    missing = false;
                }
            }
            if (missing){
                result = "fail";
            }
        }
        return result;
    }
}
