package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class PopupHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\LearningJava\\LearningJava\\Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        //Step 1- Tab handling
        Thread.sleep(2000);

        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('tabButton').click()");
        Thread.sleep(2000);

        //Step 1 get total number of tabs and windows
        Set<String> allWindowsId= driver.getWindowHandles();

        System.out.println(allWindowsId);

        Iterator<String> abc= allWindowsId.iterator();

        String win1= abc.next();
        String win2= abc.next();

        //Print titles of windows
        driver.switchTo().window(win1);
        System.out.println("Parent window ID " + win1);
        System.out.println(driver.getTitle());

        driver.switchTo().window(win2);
        System.out.println("childe window ID " + win2);
        System.out.println(driver.getCurrentUrl());


        //Step 2-handle pop up
        driver.switchTo().window(win1);
        jse.executeScript("document.getElementById('windowButton').click()");

        Set<String> allWindowsId2= driver.getWindowHandles();

        System.out.println(allWindowsId);

        Iterator<String> abc2= allWindowsId.iterator();

        String win3= abc2.next();
        String win4= abc2.next();
        Thread.sleep(2000);
        driver.switchTo().window(win4);
        Thread.sleep(2000);
        driver.quit();







    }
}
