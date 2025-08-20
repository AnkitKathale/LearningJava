package Selenium;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test()
public class TestNG {
    @DataProvider
    public Object[][] data() {
        return new String[][] {new String[] {"data1"}, new String[] {"data2"}};
    }

    @Test(dataProvider = "data",retryAnalyzer = Selenium.RetryAnalyzer.class)
    public void test(String d) {
        System.out.println(d);
        Assert.assertEquals("First Line\nSecond Lined", "First Line\nSecond Line");
    }
}