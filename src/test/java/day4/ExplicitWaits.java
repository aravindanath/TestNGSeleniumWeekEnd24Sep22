package day4;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ExplicitWaits extends Basedev {


        @Test
        public void test() throws Exception {
            driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

            driver.findElement(By.xpath("//button[text()='Start']")).click();

            WebElement msg =  driver.findElement(By.xpath("//h4[text()='Hello World!']"));

            WebDriverWait wait = new WebDriverWait(driver, 30); // Explicit wait
            wait.until(ExpectedConditions.visibilityOf(msg));

           String txt = msg.getText();

           Assert.assertEquals(txt,"Hello World!");


        }


}
