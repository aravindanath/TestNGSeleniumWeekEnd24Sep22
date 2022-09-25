package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample extends Basedev{


    @Test
    public void hardAssert(){
        System.out.println("Starting");
        driver.get("https://www.amazon.in");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));

        Assert.assertTrue(searchBar.isDisplayed(),"Serach Bar is not displayed");

//        Assert.assertEquals(pageTitle,"amazon.in");
        System.out.println("Ending");
    }

    @Test
    public void softAssert(){
        System.out.println("Starting");
        driver.get("https://www.amazon.in");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(pageTitle,"amazon.in");
        System.out.println("Ending");
        sf.assertAll();
    }
}
