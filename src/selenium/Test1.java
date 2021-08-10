package selenium;


import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Test1 {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);

    }
    @Test
    public void test() {
        try {
            driver.get("https://www.google.com/");
            driver.findElement(By.name("q")).sendKeys("webdriver");
            driver.findElement(By.name("gNO89b")).click();
            wait.until(titleIs("webdriver - Поиск в Google"));
        }
        catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("Поймано исключение, нет элемента");
        }
    }
    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
