package testReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import constants.Constantss;

public class PizzaHutExtentReports extends Constantss {
      
	ExtentReports extent;
	
	public void reportConfig() {
		String path = Constantss.JuReport;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("My Test Automation Result");
		reporter.config().setDocumentTitle("Junit Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");
		
	}
	
	public void CreateTest(String string) {
		extent.createTest("My Test Execution");
	}
	
	public void flushTest() {
		extent.flush();
	}
	
	public void reportConfig1() {
		String path = Constantss.tNGReport;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		
		reporter.config().setReportName("PizzaHut TestNG Testing");
		reporter.config().setDocumentTitle("TestNg Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");
		
	}
	
	public void CreateTest1(String string) {
		extent.createTest(string);
	}
	
	public void flushTest1() {
		extent.flush();
	}
}
