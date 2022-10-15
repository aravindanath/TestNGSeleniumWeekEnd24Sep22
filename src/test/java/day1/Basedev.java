package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Basedev {
 public     WebDriver driver = null;

    String browser = "chrome";
    @BeforeClass
    public void setup() {

        if(browser.equalsIgnoreCase("chrome")) {
            driver = WebDriverManager.chromedriver().create();
        }else if(browser.equalsIgnoreCase("firefox")) {
            driver = WebDriverManager.firefoxdriver().create();
        }else if(browser.equalsIgnoreCase("edge")){
            driver = WebDriverManager.edgedriver().create();
        }
          driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
    }


}
