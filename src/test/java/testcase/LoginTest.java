package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "//src//test//resources//chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-infobars");
        driver = new ChromeDriver(options);
    }

    @Test
    public void doLogin(){
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(By.name("q")).isDisplayed();
        driver.findElement(By.name("btnK")).isDisplayed();
        driver.findElement(By.id("gbqfbb")).isDisplayed();
        driver.findElement(By.id("hplogo")).isDisplayed();


    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
