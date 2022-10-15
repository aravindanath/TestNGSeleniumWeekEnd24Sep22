package day3;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class Generics {

    public static void drag_drop(WebDriver driver, WebElement element1, WebElement element2){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(element1,element2).perform();
    }


    public static void selectValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }


    public static void selectIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }


    public static void selectText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void sleep(long time){
        try{
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void alerAccept(WebDriver driver){
        Alert alt =  driver.switchTo().alert();
        System.out.println("Alert title: " + alt.getText());
        alt.accept();
    }


    public static void alerDismiss(WebDriver driver){
        Alert alt =  driver.switchTo().alert();
        System.out.println("Alert title: " + alt.getText());
        alt.dismiss();
    }

    public static void alerAccept(WebDriver driver, String text){
        Alert alt =  driver.switchTo().alert();
        System.out.println("Alert title: " + alt.getText());
        alt.sendKeys(text);
        alt.accept();
    }

    public static void mouseHover(WebDriver driver, WebElement element){
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
    }


    public static void verfityTitle(WebElement element, String title){
        String actual = element.getText();
        System.out.println(actual);
        Assert.assertEquals(actual,title,"Title not match");
    }

    public static void scrollToElement(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public static void takeScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot scrShot = (TakesScreenshot)driver;
        File SrcFile= scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("./screen.png");
        FileUtils.copyFile(SrcFile,DestFile);
    }

}
