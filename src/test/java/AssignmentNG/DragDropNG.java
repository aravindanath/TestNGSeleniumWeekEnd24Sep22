package AssignmentNG;

import day1.Basedev;
import day3.Generics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragDropNG extends Basedev {
    @Test
    public void function() throws InterruptedException{
        driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
        WebElement source = driver.findElement(By.xpath("(//li/a[@class='button button-orange'])[2]"));
        WebElement target = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
        Thread.sleep(3000);
        Generics.drag_drop(driver,source, target);
        Thread.sleep(3000);

    }
}
