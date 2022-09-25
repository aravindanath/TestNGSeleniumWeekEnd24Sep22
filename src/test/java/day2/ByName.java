package day2;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByName extends Basedev {

    @Test
    public void byName(){

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Selenium Jobs", Keys.ENTER);

    }


}
