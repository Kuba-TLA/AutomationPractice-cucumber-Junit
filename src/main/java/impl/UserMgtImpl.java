package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.UserMgtPage;
import pojos.User;
import utils.SeleniumUtils;

import java.util.ArrayList;
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
    List<User> allUsers = new ArrayList<>();

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

    public void addNewUser(User user){
        getPage().firstNameInput.sendKeys(user.getFirstName());
        getPage().lastNameInput.sendKeys(user.getLastName());
        getPage().phoneInput.sendKeys(user.getPhoneNumber());
        getPage().emailInput.sendKeys(user.getEmail());
        SeleniumUtils.selectByVisibleText(getPage().selectRole, user.getRole());
        getPage().submitBtn.click();

        allUsers.add(user);
    }

    public String verifyEachUserFields(){
        String result = "success";

        List<WebElement> allTds = getPage().userTableRows.findElements(By.xpath(".//td"));

        for(String eachField: userFieldInputsMap.keySet()){
            boolean missing = true;
            for(int i = 0; i < allTds.size(); i++){
                if(allTds.get(i).getText().equals(userFieldInputsMap.get(eachField))){
                    missing = false;
                    break;
                }
            }
            if (missing)
                result = "fail";
        }
        return result;
    }
}
