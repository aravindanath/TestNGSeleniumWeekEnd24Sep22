package day4;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import day1.Basedev;
import day3.Generics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.util.Date;

public class Report extends Basedev {

    ExtentSparkReporter spark;
    ExtentReports reports;


    @BeforeTest
    public void setupReport(){

        reports = new ExtentReports();


        spark = new ExtentSparkReporter("report"+Generics.currentDtTime()+".html");
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Arvind");
        spark.config().setTheme(Theme.STANDARD);
        reports.attachReporter(spark);

    }

    @Test
    public void facebookUserCreation() throws InterruptedException {
        ExtentTest   test = reports.createTest("facebookUserCreation");


        driver.get("https://www.facebook.com/");
        test.info(driver.getCurrentUrl());

        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        test.info(driver.getTitle());
        for (int i = 1; i < 2; i++) {
            String firstname = Generics.firstName(),lastname = Generics.lastName(),email = Generics.email();
            WebElement fn = driver.findElement(By.name("firstname"));
            fn.clear();
            fn.sendKeys(Generics.firstName());
            test.info("First Name: "+firstname);
            Thread.sleep(1000);
            WebElement ln = driver.findElement(By.name("lastname"));
            ln.clear();
            ln.sendKeys(Generics.lastName());
            test.info("Last Name: "+lastname);
            Thread.sleep(1000);
            WebElement emailfield = driver.findElement(By.name("reg_email__"));
            emailfield.clear();
            emailfield.sendKeys(email);
            test.info("Email: "+email);
            Thread.sleep(1000);
        }
    }

    @AfterTest
    public void close(){
        reports.flush();
    }
}
