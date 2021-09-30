package impl;

import jdk.internal.util.xml.impl.Input;
import pages.DatabasePage;
import pages.InputsPage;
import pages.UserMgtPage;

public class DatabaseImpl {
    DatabasePage page;
    UserMgtPage userMgtPage;
    InputsPage inputsPage;

    public DatabasePage getPage(){
        if(page == null)
            page = new DatabasePage();
        return page;
    }

    public UserMgtPage getUserMgtPage(){
        if(userMgtPage == null)
            userMgtPage = new UserMgtPage();
        return userMgtPage;
    }

    public InputsPage inputsPage(){
        if(inputsPage == null)
            inputsPage = new InputsPage();
        return inputsPage;
    }
}
