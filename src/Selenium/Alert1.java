package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alert1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\LearningJava\\LearningJava\\Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        //Accept Alert-JS executer

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementById('confirmButton').click()");
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();

        System.out.println("Alert Dismissed");





    }
}
