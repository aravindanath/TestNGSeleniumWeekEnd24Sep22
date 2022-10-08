package day3;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandling extends Basedev {

    @Test
    public void functions() throws InterruptedException {
        driver.navigate().to("https://canarabank.com/");

       WebElement ele1 = driver.findElement(By.xpath("//p[text()='LOGIN']"));


        Generics.mouseHover(driver,ele1);

        String parentWindow = driver.getWindowHandle();

        System.out.println("parentWindow: " + parentWindow);

        driver.findElement(By.xpath("//a[text()='Net Banking - Canara']")).click();


        Set<String> wins =   driver.getWindowHandles();

        for(String win : wins) {
            driver.switchTo().window(win);
        }

        driver.findElement(By.xpath("//button[contains(text(),'Net Banking - Retail ')]")).click();
        Generics.sleep(3000);
        driver.close();

        driver.switchTo().window(parentWindow);

        System.out.println(driver.getTitle());



    }
}













