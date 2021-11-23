package comsyntax.class21.poly;

public class WebDriverTester {
    public static void main(String[] args) {
/*        GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.signUp();
        googleChrome.login();
        googleChrome.enterUserPassword();
        googleChrome.clickSubmit();
        googleChrome.closeBrowser();
        //The above method takes forever if doing this for each class. It sucks
   */
   WebDriver webDriver=new GoogleChrome();
        webDriver.openWebsite();
        webDriver.signUp();
        webDriver.login();
        webDriver.enterUserPassword();
        webDriver.clickSubmit();
        webDriver.closeBrowser();
        //If i want to test the other browsers, I just need to change GoogleChrome to another class name

        WebDriver[] webDrivers={new GoogleChrome(), new Firefox(), new Safari()};
        for(WebDriver wd:webDrivers){
            wd.openWebsite();
            wd.signUp();
            wd.login();
            wd.enterUserPassword();
            wd.clickSubmit();
            wd.closeBrowser();
        } //the above allows me to run all the classes and all the methods, with minimal amounts of coding

        //TYPE CASTING
//        WebDriver webDriver1=new Firefox();
//        GoogleChrome chrome=(GoogleChrome) webDriver1;//this is a type of downcasting that WONT work, since webDriver1 is currently holding Firefox, not GoogleChrome
        WebDriver webDriver1=new GoogleChrome();
        GoogleChrome chrome=(GoogleChrome) webDriver1; //This is allowed, since we are retrieving GoogleChrome from webDriver1
    }
}
