package impl;

import pages.DatabasePage;
import pages.LoginPage;
import pages.UserMgtPage;

public class LoginImpl {
    LoginPage page;
    UserMgtPage userMgtPage;

    public LoginPage getPage(){
        if(page == null)
            page = new LoginPage();
        return page;
    }

    public UserMgtPage getUserMgtPage(){
        if(userMgtPage == null)
            userMgtPage = new UserMgtPage();
        return userMgtPage;
    }
}
