package day3;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Form extends Basedev {

    @Test
    public void functions() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys("Arvind");
       List<WebElement> radiobuttons =  driver.findElements(By.xpath("(//div[@class='col-md-9 col-sm-12'])[2]/div/label"));

       for(WebElement rb : radiobuttons){
           System.out.println(rb.getText());
           if(rb.getText().equalsIgnoreCase("male")){
               rb.click();
             //  break;
           }
       }

       driver.findElement(By.xpath("//div[@class='react-datepicker__input-container']")).click();

       List<WebElement> date = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));

       for(WebElement dt   : date){
           if(dt.getText().equalsIgnoreCase("19")){
               dt.click();
               break;
           }
       }
        Thread.sleep(2000);
        List<WebElement> cb = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']/label"));

        for(WebElement dt : cb){
            System.out.println(dt.getText());
            if(dt.getText().equalsIgnoreCase("Sports") || dt.getText().equalsIgnoreCase("Music")) {
                dt.click();
            }
        }

      WebElement sport =   driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));

        System.out.println("Sport is selected? " + sport.isSelected());
        System.out.println("Sport is display? " + sport.isDisplayed());
        System.out.println("Sport is enabled? " + sport.isEnabled());

        driver.findElement(By.id("uploadPicture")).sendKeys("/Users/aravindanathdm/Downloads/TestNgSelenium/src/test/java/day3/TopicsList");
        Thread.sleep(2000);
    }
}













