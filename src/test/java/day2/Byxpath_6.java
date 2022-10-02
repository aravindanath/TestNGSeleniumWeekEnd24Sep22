package day2;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Byxpath_6 extends Basedev {

    @Test
    public void byName(){

        driver.get("https://the-internet.herokuapp.com/tables");
//        String fn  []  = {"John","Frank","Jason","Tim"};

      List<WebElement> fn = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));

        for(WebElement  str : fn ){
            System.out.println(str.getText());
            WebElement com =  driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2][contains(text(),'"+str.getText()+"')]//preceding-sibling::td"));
            System.out.println(com);
            System.out.println(str.getText()+": " + com.getText());
        }

    }

    /**
     * gold : 2345234
     * siver: 42345
     * cotton: 2345234
     */

}
