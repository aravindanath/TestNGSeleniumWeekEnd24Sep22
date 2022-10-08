package day3;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dropdowns extends Basedev {

    @Test
    public void functions() throws InterruptedException {
        driver.navigate().to("https://www.wikipedia.org/");

       WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchLanguage']"));

       Generics.sleep(3000);

       Generics.selectIndex(dropdown,30);

        Generics.sleep(3000);

        Generics.selectValue(dropdown,"ar");
        Generics.sleep(3000);
        Generics.selectText(dropdown,"हिन्दी");



    }
}













