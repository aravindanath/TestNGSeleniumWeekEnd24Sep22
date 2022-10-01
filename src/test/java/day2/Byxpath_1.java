package day2;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Byxpath_1 extends Basedev {

    @Test
    public void byName(){

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name='q' or @type='text']")).sendKeys("Selenium Jobs", Keys.ENTER);

    }


}
