package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Basedev {
    WebDriver driver = null;

    String browser = "chrome";
    @BeforeClass
    public void setup() {

        if(browser.equalsIgnoreCase("chrome")) {
            driver = WebDriverManager.chromedriver().create();
        }else if(browser.equalsIgnoreCase("firefox")) {
            driver = WebDriverManager.firefoxdriver().create();
        }
          driver.manage().window().maximize();

    }


}
