package base;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

public class commonAPI {



    public WebDriver driver;

    @BeforeMethod

    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/ameladervishi/IdeaProjects/Selenium/Generic/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeThePage(){
        driver.close();
    }
    //type
    public void typeOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }



}
