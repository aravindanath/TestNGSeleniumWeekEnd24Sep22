package day2;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByID extends Basedev {

    @Test
    public void byID(){

        driver.get("https://www.amazon.in");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Todays deal", Keys.ENTER);

    }


}
