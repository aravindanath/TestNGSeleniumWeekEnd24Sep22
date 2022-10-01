package day2;

import day1.Basedev;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Byxpath_3 extends Basedev {

    @Test
    public void byName(){

        driver.get("https://www.amazon.in");

        driver.findElement(By.xpath("//a[starts-with(text(), 'Today')]")).click();
    }


}
