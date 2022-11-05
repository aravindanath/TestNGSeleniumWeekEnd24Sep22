package AssignmentNG;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TripAdvisor extends Basedev {
    @Test
    public void function() throws InterruptedException {
        driver.navigate().to("https://www.tripadvisor.in/");
        Thread.sleep(5000);
        WebElement element =  driver.findElement(By.xpath("(//input[@class='qjfqs _G B- z _J Cj R0'])[2]"));
        element.click();

//        WebElement element = driver.findElement(By.xpath("//input[@type='search' or  @title='Search']"));
       // WebElement element = driver.findElement(By.xpath("//form[@action='/Search']/input[@type='search']"));
  //      element.click();
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOf(element));
//        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys("Club Mahindra");

    }
}
