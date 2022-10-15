package day3;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class FrameHandling extends Basedev {

    @Test
    public void functions() throws InterruptedException {
        driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");

        driver.switchTo().frame("packageListFrame");

        driver.findElement(By.linkText("java.applet")).click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("classFrame");

        driver.findElement(By.linkText("java.applet")).click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("packageFrame");

        driver.findElement(By.linkText("Applet")).click();


    }
}













