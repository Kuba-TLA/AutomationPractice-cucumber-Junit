package impl;

import pages.InputsPage;
import pages.UserMgtPage;

public class InputsImpl {
    InputsPage page;
    UserMgtPage userMgtPage;

    public InputsPage getPage(){
        if (page == null)
            page = new InputsPage();
        return page;
    }

    public UserMgtPage getUserMgtPage(){
        if (userMgtPage == null)
            userMgtPage = new UserMgtPage();
        return userMgtPage;
    }

    public void fillInputFieldInputsPage(String fieldName, String value){
        switch (fieldName.toLowerCase()){
            case "first name": getPage().firstNameInputField.sendKeys(value);
            break;
            case "last name":getPage().lastNameInputField.sendKeys(value);
                break;
            case "email":getPage().emailInputField.sendKeys(value);
                break;
            case "phone":getPage().phoneInputField.sendKeys(value);
                break;
            case "address":getPage().addressInputField.sendKeys(value);
                break;
            case "city":getPage().cityInputField.sendKeys(value);
                break;
            case "zip code":getPage().zipCodeInputField.sendKeys(value);
                break;
            default:
                System.out.println("Field name was not found...");
        }
    }
}
