package day3;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CalenderAndAutosuggestion extends Basedev {

    @Test
    public void functions() throws InterruptedException {
        driver.navigate().to("https://www.redbus.in/");

        driver.findElement(By.id("src")).sendKeys("Bang");
        Thread.sleep(2000);
      List<WebElement> src =   driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));

      System.out.println(src.size());

      for (WebElement srcElement : src) {
          System.out.println( srcElement.getText());
          if(srcElement.getText().equalsIgnoreCase("White Field, Bangalore")){
              srcElement.click();
              break;
          }
      }
        Thread.sleep(2000);
        driver.findElement(By.id("dest")).sendKeys("Hyd");
        Thread.sleep(2000);
        List<WebElement> dest =   driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));

        System.out.println(dest.size());

        for (WebElement srcElement : dest) {
            System.out.println( srcElement.getText());
            if(srcElement.getText().equalsIgnoreCase("Nizampet, Hyderabad")){
                srcElement.click();
                break;
            }
        }
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-onward-calendar.icon")).click();

       List<WebElement> calender = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));


       for(WebElement cal : calender){
           if(cal.getText().equalsIgnoreCase("30")){
               cal.click();
               break;
           }
       }
       Thread.sleep(5000);

       driver.findElement(By.cssSelector("#search_btn")).click();
        Thread.sleep(2000);
    }
}













