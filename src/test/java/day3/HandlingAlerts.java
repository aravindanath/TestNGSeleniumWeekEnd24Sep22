package day3;

import day1.Basedev;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class HandlingAlerts extends Basedev {

    @Test
    public void functions() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Generics.sleep(3000);
       Alert alt =  driver.switchTo().alert();
       System.out.println("Alert title: " + alt.getText());
       alt.accept();

        Generics.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Generics.sleep(3000);
        Generics.alerDismiss(driver);
        Generics.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Generics.alerAccept(driver,"hello");

        WebElement webElement = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println("Result: " + webElement.getText());




    }
}













