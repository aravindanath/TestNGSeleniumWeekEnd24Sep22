package day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
}
