package selenium;


import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Test1 extends TestBase {

    @Test
    public void test1()  {
        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(960, 1040));
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        }

    @Test
    public void test2() {
        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(960, 1040));
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Test
    public void test3() {
        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(960, 1040));
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    }
