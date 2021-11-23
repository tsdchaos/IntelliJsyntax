package comsyntax.class21.poly;

public class WebDriver {
    void openWebsite(){
        System.out.println("Opening a website");
    }
    void signUp(){
        System.out.println("Signup on the website");
    }
    void login(){
        System.out.println("Login to the website");
    }
    void enterUserPassword(){
        System.out.println("Entering the user password");
    }
    void clickSubmit(){
        System.out.println("Clicking submit button");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website in Google Chrome");
    }
    void signUp(){
        System.out.println("Signup on the website in Google Chrome");
    }
    void login(){
        System.out.println("Login to the website  inGoogle Chrome");
    }
    void enterUserPassword(){
        System.out.println("Entering the user password in Google Chrome");
    }
    void clickSubmit(){
        System.out.println("Clicking submit button in Google Chrome");
    }
    void closeBrowser(){
        System.out.println("Closing the browser in Google Chrome");
    }
}
class Firefox extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website in Firefox");
    }
    void signUp(){
        System.out.println("Signup on the website in Firefox");
    }
    void login(){
        System.out.println("Login to the website  in Firefox");
    }
    void enterUserPassword(){
        System.out.println("Entering the user password in Firefox");
    }
    void clickSubmit(){
        System.out.println("Clicking submit button in Firefox");
    }
    void closeBrowser(){
        System.out.println("Closing the browser in Firefox");
    }
}

class Safari extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website in Safari");
    }
    void signUp(){
        System.out.println("Signup on the website in Safari");
    }
    void login(){
        System.out.println("Login to the website  in Safari");
    }
    void enterUserPassword(){
        System.out.println("Entering the user password in Safari");
    }
    void clickSubmit(){
        System.out.println("Clicking submit button in Safari");
    }
    void closeBrowser(){
        System.out.println("Closing the browser in Safari");
    }
}