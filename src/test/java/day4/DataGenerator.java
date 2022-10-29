package day4;

import com.github.javafaker.Faker;
import day1.Basedev;
import day3.Generics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Locale;

public class DataGenerator extends Basedev {


    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        for (int i = 1; i < 10; i++) {
            WebElement fn = driver.findElement(By.name("firstname"));
            fn.clear();
            fn.sendKeys(Generics.firstName());
            Thread.sleep(1000);
            WebElement ln = driver.findElement(By.name("lastname"));
            ln.clear();
            ln.sendKeys(Generics.lastName());
            Thread.sleep(1000);
            WebElement email = driver.findElement(By.name("reg_email__"));
            email.clear();
            email.sendKeys(Generics.email());
            Thread.sleep(1000);
        }

    }

}
