package day3;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScrollingExample extends Basedev {

    @Test
    public void functions() throws InterruptedException, IOException {
        driver.navigate().to("https://www.amazon.in");

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));

        Generics.scrollToElement(driver, element);

        Thread.sleep(4000);
        element.click();
        Generics.takeScreenshot(driver);
    }
}













