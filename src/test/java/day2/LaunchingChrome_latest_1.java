package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingChrome_latest_1 {

    @Test
    public void test() throws InterruptedException {

        WebDriver driver =   WebDriverManager.chromedriver().create();

//                driver.get("https://www.amazon.in");

        Thread.sleep(3000);



    }
}
