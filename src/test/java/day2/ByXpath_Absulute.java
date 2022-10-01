package day2;

import day1.Basedev;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXpath_Absulute extends Basedev {

    @Test
    public void byName(){

        driver.get("https://www.icicibank.com/");

       driver.findElement(By.className("ic-btn")).click();

    }


}
