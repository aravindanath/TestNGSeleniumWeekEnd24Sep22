package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Search_004 extends BaseClass {

    @Test
    public void TC_Search_001() throws InterruptedException {

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Appium jobs", Keys.ENTER);
        Thread.sleep(5000);
        Reporter.log("Page Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Title: " + driver.getTitle());
        Reporter.log("Page Title: " + driver.getTitle());
    }

}
