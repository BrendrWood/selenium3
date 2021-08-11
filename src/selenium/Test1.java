package selenium;


import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;


import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Test1 {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-fullscreen");
            //driver = new ChromeDriver(options);
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(ChromeOptions.CAPABILITY, options);
            driver = new ChromeDriver(caps);
            wait = new WebDriverWait(driver, 10);

    }
    @Test
    public void test1() {
            try {
                driver.get("https://www.google.com/");
                driver.findElement(By.name("q")).sendKeys("webdriver");
                WebElement gNO89b = driver.findElement(By.name("gNO89b"));
                gNO89b.click();
                wait.until(titleIs("webdriver - Поиск в Google"));
            }
            catch (NoSuchElementException e) {
            System.out.println("Пойман NoSuchElementException. Элемент gNO89b");
        }
        }



//    @Test
//    public void test2() {
//        driver.get("https://www.google.com/");
//        driver.findElement(By.name("q")).sendKeys("webdriver");
//        WebElement gNO89b = driver.findElement(By.name("gNO89b"));
//        gNO89b.click();
//        wait.until(titleIs("webdriver - Поиск в Google"));
//    }
//
//    @Test
//    public void test3() {
//        driver.get("https://www.google.com/");
//        driver.findElement(By.name("q")).sendKeys("webdriver");
//        WebElement gNO89b = driver.findElement(By.name("gNO89b"));
//        gNO89b.click();
//        wait.until(titleIs("webdriver - Поиск в Google"));
//    }

    @After
    public void stop(){
        driver.close();
        driver = null;
    }
}
