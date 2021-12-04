package comsyntax.Class24.Task1;

public interface WebDriver {
    //Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
    //maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void closeBrowser() {
        System.out.println("Close the Chrome Web Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Start your search by typing in the address bar at the top");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Chrome window by clicking the maximize button in the top right corner");
    }

    @Override
    public void openBrowser() {
        System.out.println("Open the Google Chrome Web Browser");
    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void closeBrowser() {
        System.out.println("Close the Firefox Web Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Start your search by typing in the google add-on bar");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Firefox window by clicking the maximize button in the top right corner");
    }

    @Override
    public void openBrowser() {
        System.out.println("Open the Firefox Web Browser");
    }
}
