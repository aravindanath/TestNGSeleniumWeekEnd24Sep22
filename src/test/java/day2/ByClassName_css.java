package day2;

import day1.Basedev;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByClassName_css extends Basedev {

    @Test
    public void byName(){

        driver.get("https://www.icicibank.com/");

//       driver.findElement(By.className("ic-btn")).click();

        driver.findElement(By.cssSelector(".ic-btn")).click();

    }


}
