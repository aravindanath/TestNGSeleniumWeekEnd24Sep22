package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Search_002  extends BaseClass{

    @Test
    public void TC_Search_001() throws InterruptedException {

        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("todays deal",Keys.ENTER);
        Thread.sleep(4000);
        System.out.println("Page Title: " + driver.getTitle());
        Reporter.log("Page Title: " + driver.getTitle());
        Reporter.log("Page Current URL: " + driver.getCurrentUrl());
    }

}
