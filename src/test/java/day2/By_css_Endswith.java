package day2;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class By_css_Endswith extends Basedev {

    @Test
    public void byID(){

        driver.get("https://www.amazon.in");
        driver.findElement(By.cssSelector("input[id$='box']")).sendKeys("Todays deal", Keys.ENTER);

    }


}
