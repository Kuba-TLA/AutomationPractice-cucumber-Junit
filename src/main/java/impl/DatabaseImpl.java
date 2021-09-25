package impl;

import pages.DatabasePage;
import pages.UserMgtPage;

public class DatabaseImpl {
    DatabasePage page;
    UserMgtPage userMgtPage;

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
}
