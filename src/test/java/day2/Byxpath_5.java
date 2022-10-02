package day2;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Byxpath_5 extends Basedev {

    @Test
    public void byName(){

        driver.get("https://www.moneycontrol.com/markets/global-indices/");
        String commodity  []  = {"GOLD","SILVER","COTTON"};

        for(String  str : commodity ){

            WebElement com =  driver.findElement(By.xpath("(//table[@class='mctable1'])[3]/tbody/tr/td/p/a[contains(text(),'"+str+"')]//following::td[1]"));
            System.out.println(str+": " + com.getText());
        }

    }

    /**
     * gold : 2345234
     * siver: 42345
     * cotton: 2345234
     */

}
