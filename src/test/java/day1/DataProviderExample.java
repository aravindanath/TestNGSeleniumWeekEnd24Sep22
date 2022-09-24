package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample  extends Basedev{




        @Test(dataProvider = "testData")
        public void loginTest(String username, String pass) throws InterruptedException {
            driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
            WebElement email =  driver.findElement(By.id("Email"));
            email.clear();
            email.sendKeys(username);
            WebElement password = driver.findElement(By.id("Password"));
            password.clear();
            password.sendKeys(pass, Keys.ENTER);
            Thread.sleep(4000);

        }


        @DataProvider
        public Object[][] testData(){

            Object[][] data = new Object[3][2];
            data[0][0]="arvind@gmail.com";
            data[0][1]="13414123@wer";
            data[1][0]="prajwal@gmail.com";
            data[1][1]="13414123@wer";
            data[2][0]="admin@yourstore.com";
            data[2][1]="admin";
            return data;
        }
}
