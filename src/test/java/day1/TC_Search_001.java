package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Search_001 extends Basedev {

    @Test
    public void TC_Search_001() throws InterruptedException {

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Selenium Appium jobs", Keys.ENTER);
        Thread.sleep(5000);
        System.out.println("Page Title: " + driver.getTitle());
        Reporter.log("Page Title: " + driver.getTitle());
        Reporter.log("Page Current URL: " + driver.getCurrentUrl());


    }

}
