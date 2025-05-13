package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.EmailableReporter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {

        //load file
        File f1= new File("D:\\Automation\\LearningJava\\LearningJava\\Repository\\locators.properties");
        FileInputStream fi= new FileInputStream(f1);

        //create properties class
        Properties p1= new Properties();
        p1.load(fi);

        System.setProperty("webdriver.chrome.driver","D:\\Automation\\LearningJava\\LearningJava\\Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.xpath(p1.getProperty("Email"))).sendKeys("abc@GMAIL.COM");






    }
}
