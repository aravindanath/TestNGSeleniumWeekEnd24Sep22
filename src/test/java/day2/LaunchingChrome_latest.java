package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class LaunchingChrome_latest {

    @Test
    public void test(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
                driver.get("https://www.amazon.in");




    }
}
