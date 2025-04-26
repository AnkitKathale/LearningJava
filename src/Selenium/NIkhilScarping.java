package Selenium;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class NIkhilScarping {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\LearningJava\\LearningJava\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.magicbricks.com/property-for-sale/residential-real-estate?bedroom=4,%3E5&proptype=Multistorey-Apartment,Builder-Floor-Apartment,Penthouse,Studio-Apartment&Locality=Aundh,Baner,Pashan&cityName=Pune&BudgetMax=20-Crores");

        driver.manage().window().maximize();


        // Give time for page to load content
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long lastHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();
        int attempts = 0;

        while (attempts < 10) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                Thread.sleep(3000); // Wait for more listings to load
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long newHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();
            if (newHeight == lastHeight) {
                break;
            }
            lastHeight = newHeight;
            attempts++;
        }

        List<WebElement> names = driver.findElements(By.className("mb-srp__card--title"));
        List<WebElement> links = driver.findElements(By.className("mb-srp__card__society--name"));
        List<WebElement> prices = driver.findElements(By.className("mb-srp__card__price--amount"));

        // Create Excel workbook
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Properties");

        // Create header row
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Property Name");
        header.createCell(1).setCellValue("Society/Link");
        header.createCell(2).setCellValue("Price");

        // Write data to Excel
        int rowNum = 1;
        for (int i = 0; i < names.size(); i++) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(names.get(i).getText());
            if (i < links.size()) {
                row.createCell(1).setCellValue(links.get(i).getText());
            }
            if (i < prices.size()) {
                row.createCell(2).setCellValue(prices.get(i).getText());
            }
        }

        // Save Excel file
        try {
            FileOutputStream fileOut = new FileOutputStream("MagicBricks_Properties.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            System.out.println("Excel file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
