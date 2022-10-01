package day2;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByTagName extends Basedev {

    @Test
    public void byName(){

        driver.get("https://www.amazon.in/");


        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links: " + links.size());

        for(WebElement link : links){
            System.out.println(link.getText() +" ---> "+link.getAttribute("href"));
        }

    }


}
