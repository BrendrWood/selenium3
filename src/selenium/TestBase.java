package selenium;

import org.junit.Before;
//import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class TestBase {

    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start() {
        DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability(FirefoxDriver.MARIONETTE, false);
        driver = new FirefoxDriver(
                 new FirefoxBinary(new File("c:\\Program Files\\Mozilla Firefox\\firefox.exe")),
                 new FirefoxProfile(), caps);

        System.out.println(((HasCapabilities) driver).getCapabilities());
        wait = new WebDriverWait(driver, 10);
    }
    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

}
