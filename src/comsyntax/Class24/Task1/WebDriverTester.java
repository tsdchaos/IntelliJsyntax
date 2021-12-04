package comsyntax.Class24.Task1;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDriver={new ChromeDriver(), new FirefoxDriver()};
        for(WebDriver webDrivers: webDriver){
            webDrivers.openBrowser();
            webDrivers.maximizeWindow();
            webDrivers.findElement();
            webDrivers.closeBrowser();

        }
    }
}

