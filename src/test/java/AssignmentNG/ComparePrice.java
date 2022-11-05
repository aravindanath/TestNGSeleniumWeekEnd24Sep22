package AssignmentNG;

import day1.Basedev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ComparePrice extends Basedev {
    @Test
    public void functions() throws InterruptedException {
        driver.navigate().to("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 13 256 GB");
        driver.findElement(By.id("nav-search-submit-button")).click();

        String prtitle = driver.findElement(By.xpath("(//span[@class = 'a-size-medium a-color-base a-text-normal'])[1]")).getText();
        String price =driver.findElement(By.xpath("(//span[@class = 'a-price-whole'])[1]")).getText();
        System.out.println("Amazon Site "+ prtitle + " " + price);
        String p = price.replaceAll(",","");
        int number = 0;
        try{
            number = Integer.parseInt(p);
            System.out.println(number);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        System.out.println("Amazon Site Price for  "+ prtitle + "is " + number);
        // flipkart code

        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iPhone 13 256 GB");
        driver.findElement(By.xpath("//button[@class= 'L0Z3Pu']")).click();
        String fphonedesc = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).getText();
        System.out.println("flipkart product title " + fphonedesc );
        String fphoneprice = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
        System.out.println("flipkart product price " + fphoneprice );
        String CorrectPrice1 = fphoneprice.replace("₹","");
        String CorrectPrice2 = CorrectPrice1.replace(",","");
        System.out.println("flipkar Price "+ CorrectPrice2 );

    }
}
