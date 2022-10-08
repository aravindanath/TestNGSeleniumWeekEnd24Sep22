package day3;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAction_2 extends Basedev {

    @Test
    public void functions() throws InterruptedException {
        driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");

       WebElement ele1 = driver.findElement(By.xpath("(//li[@id='fourth']/a)[1]"));
        WebElement ele2 = driver.findElement(By.xpath("//ol[@id='amt7']/li"));

        Thread.sleep(2000);

        Generics.drag_drop(driver,ele1,ele2);



    }
}













