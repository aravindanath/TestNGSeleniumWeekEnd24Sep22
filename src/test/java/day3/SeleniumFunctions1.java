package day3;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumFunctions1 extends Basedev {

    @Test
    public void functions() throws InterruptedException {
        driver.navigate().to("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Selenium jobs", Keys.ENTER);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//h3[text()='Selenium Jobs, 11235 Selenium Job Vacancies In October 2022']")).click();

        driver.navigate().back();

        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
    }
}
