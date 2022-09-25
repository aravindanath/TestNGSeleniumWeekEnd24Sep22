package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class LaunchingChrome {

    @Test
    public void test(){

        String path = System.getProperty("user.dir")+ File.separator+"driver"+File.separator+"chromedriver";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");



    }
}
