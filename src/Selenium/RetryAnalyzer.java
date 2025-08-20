package Selenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int counter=0;
    int retries=5;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(counter< retries){
            counter++;
            return true;
        }
        return false;
    }
}
