package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        // Setting the property of chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\Ankit\\New folder\\LearningJava\\Drivers\\chromedriver.exe");
        //Launching chrome driver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/radio-buttons");

        //first way
//        driver.findElement(By.xpath("//input[@id='blue']")).click();//blue
//        driver.findElement(By.xpath("//input[@id='red']")).click();//red
//        driver.findElement(By.xpath("//input[@id='yellow']")).click();
//        driver.findElement(By.xpath("//input[@id='black']")).click();//black

        //second way
//        List<WebElement> rad = driver.findElements(By.xpath("//input[@type='radio']"));
//        System.out.println(rad.size());
//        System.out.println(rad.get(0).isSelected()); //true
//        System.out.println(rad.get(1).isEnabled());// true
//        System.out.println(rad.get(2).isDisplayed());//true
//        rad.get(2).click();//Yellow
//        System.out.println(rad.get(2).isSelected());//true

        //Third way
        List<WebElement> radText = driver.findElements(By.xpath("//label[@class='form-check-label']"));
        String expectedResult="yellow";

        System.out.println(radText.get(1).getText());
        for(int i=0;i< radText.size();i++){
            if(radText.get(i).getText().equalsIgnoreCase(expectedResult)){
                radText.get(i).click();
                System.out.println(radText +"  is clicked");
            }
        }


    }
}
