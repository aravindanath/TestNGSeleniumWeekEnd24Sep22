package day3;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class MouseAction_1 extends Basedev {

    @Test
    public void functions() throws InterruptedException {
        driver.navigate().to("https://www.ajio.com/");

        WebElement women = driver.findElement(By.xpath("//a[text()='WOMEN']"));

        Thread.sleep(2000);

        Actions act = new Actions(driver);
        act.moveToElement(women).perform();
        Thread.sleep(2000);
        WebElement winter = driver.findElement(By.xpath("//a[text()='Dresses & Gowns']"));

        act.click(winter).perform();

    }
}













