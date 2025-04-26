package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\LearningJava\\LearningJava\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers");
        List<WebElement> CompanyName = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a")); //lists all companies in that column
        List<WebElement> CompanyPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
//        System.out.println(CompanyName.size());
//        System.out.println(CompanyPrice.size());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a")));

        String expResult="I P Rings Ltd.";

        for(int i =0;i<CompanyName.size();i++){
            if(CompanyName.get(i).getText().equalsIgnoreCase(expResult)){
                System.out.println(CompanyName.get(i).getText()+"======"+CompanyPrice.get(i).getText());


                CompanyName.get(i).click();
                System.out.println(driver.getTitle());


                break;

            }
        }
        driver.close();

    }
}
