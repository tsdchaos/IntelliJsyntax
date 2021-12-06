package comsyntax.GroupProjectIndividualAssignments;

import java.rmi.Remote;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakeScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakeScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening Google Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Google Chrome Browser");
    }

    @Override
    public String getTitle() {
        return "Title from Google Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking screenshot from Google Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate using Google Chrome");
    }
}
class Firefox implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening Google Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Google Firefox Browser");
    }

    @Override
    public String getTitle() {
        return "Title from Firefox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking screenshot from Google Firefox");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate using Google Firefox");
    }
}

class Safari implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening Google Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Google Safari Browser");
    }

    @Override
    public String getTitle() {
        return "Title from Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking screenshot from Google Safari");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate using Google Safari");
    }
}

class WebDriverTester{
    public static void main(String[] args) {
        RemoteWebDriver[] remoteWebDrivers={new ChromeDriver(), new Firefox(), new Safari()};
        for(RemoteWebDriver remote: remoteWebDrivers){
            if(remote instanceof ChromeDriver){
                System.out.println(((ChromeDriver) remote).getTitle());
            }else if(remote instanceof Firefox){
                System.out.println(((Firefox) remote).getTitle());
            }else if(remote instanceof Safari){
                System.out.println(((Safari) remote).getTitle());
            }
            remote.open();
            remote.close();
            remote.getScreenshot();
            remote.navigate();
        }
    }
}
