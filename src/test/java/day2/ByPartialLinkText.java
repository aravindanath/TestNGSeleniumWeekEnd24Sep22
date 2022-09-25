package day2;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByPartialLinkText extends Basedev {

    @Test
    public void byName() throws InterruptedException {

        driver.get("https://www.google.com");

        driver.findElement(By.partialLinkText("Imag")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("White field", Keys.ENTER);

    }


}
