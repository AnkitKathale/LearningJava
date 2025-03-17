package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // Setting the property of chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\Ankit\\New folder\\LearningJava\\Drivers\\chromedriver.exe");
        //Launching chrome driver instance
        WebDriver driver = new ChromeDriver();

        //Wait for 2 seconds
        Thread.sleep(2000);

        //Launch URL using get method
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("Allah");
        //Navigating to different url
        driver.navigate().to("https://www.facebook.com");

        //Refresh page
        Thread.sleep(2000);
        driver.navigate().refresh();

        //Go back
        Thread.sleep(200);
        driver.navigate().back();

        //Fetch current url
        String cur= driver.getCurrentUrl();
        System.out.println(cur);
        //Fetch title
        System.out.println(driver.getTitle());


        //CLose browser
        Thread.sleep(2000);
        driver.quit();
    }

}
