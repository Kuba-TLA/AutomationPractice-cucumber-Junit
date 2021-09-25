package impl;

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

    public String getImageSrcValue(String imgName){
        String imageSrc = "";
        switch (imgName.toLowerCase()){
            case "tla logo": imageSrc = getPage().tlaLogo.getAttribute("src");
                break;
            default:
                System.out.println("image was not found");
        }
        return imageSrc;
    }
}
