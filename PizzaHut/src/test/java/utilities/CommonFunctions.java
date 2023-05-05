package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import constants.Constantss;

public class CommonFunctions {

    public void scrollWebPage() {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.getDriver();
        js.executeScript("window.scrollBy(0, 389)", "");
    }
    
    public void scrollWebPage1() {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.getDriver();
        js.executeScript("window.scrollBy(0, 550)", "");
    }
    
    public void scrollWebPage2() {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.getDriver();
        js.executeScript("window.scrollBy(0, 800)", "");
    }
    
    public void scrollWebPage3() {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.getDriver();
        js.executeScript("window.scrollBy(0, 1100)", "");
    }
    
    public void takeScreenShot() throws IOException {
    	TakesScreenshot srcshot = (TakesScreenshot)  DriverInit.getDriver();
    	File srcfile = srcshot.getScreenshotAs(OutputType.FILE);
    	File destFile = new File(Constantss.screenshotLocation);
		FileUtils.copyFile(srcfile, destFile);
    }
}
