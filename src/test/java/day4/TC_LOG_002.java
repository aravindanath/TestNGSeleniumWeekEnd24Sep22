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
public class TC_LOG_002 extends Basedev {

    @Test
    public void loginSuccess(){

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmiths");

        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement header = driver.findElement(By.xpath("//div[@id='flash']"));

        Generics.verfityTitle(header,"Your username is invalid!\n×");


    }
}
