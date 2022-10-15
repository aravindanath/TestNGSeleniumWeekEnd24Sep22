package day4;

import day1.Basedev;
import day3.Generics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


/**
 * @author arvind
 * @Discription : Login Success
 */
public class TC_LOG_001 extends Basedev {

    @Test
    public void loginSuccess(){

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");

        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement header = driver.findElement(By.xpath("//h4"));

        Generics.verfityTitle(header,"Welcome to the Secure Area. When you are done click logout below.");


    }
}
