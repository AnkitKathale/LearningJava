package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\LearningJava\\LearningJava\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dropdown");
        //driver.findElement(By.xpath("//select[@id='country']")).click();
        //1st way
        List<WebElement> dd = driver.findElements(By.xpath("//*[@id=\"country\"]/option"));
        System.out.println("TOtal dropdown choices  " + dd.size());
        Thread.sleep(3000);

        //2nd way using select class has 3 methods selectbyvalue,
        WebElement bm = driver.findElement(By.xpath("//select[@id='country']"));
        Select country = new Select(bm);
        country.selectByVisibleText("India");
        System.out.println(country.getFirstSelectedOption().getText());
        country.selectByIndex(13);
        System.out.println(country.getFirstSelectedOption().getText());
        country.selectByValue("AO");
        System.out.println(country.getFirstSelectedOption().getText());

        //3rd way
        List<WebElement> c = country.getOptions();
        System.out.println(c.size());





    }
}
