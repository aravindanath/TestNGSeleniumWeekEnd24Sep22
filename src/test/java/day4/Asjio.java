package day4;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Asjio  extends Basedev {


        @Test
        public void test() throws Exception {
            driver.get("https://www.ajio.com/s/dupattas-women");

            List<WebElement> titles =    driver.findElements(By.xpath(" //a[@class='rilrtl-products-list__link']/div/div[2]/div[2]"));


            System.out.println("Titles: " + titles.size());

            for (WebElement title : titles) {
                System.out.println("Title: " + title.getText());
            }

        }


}
