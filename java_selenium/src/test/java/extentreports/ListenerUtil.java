package extentreports;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import listners.ListenerUtility;

public class ListenerUtil implements ITestListener , ISuiteListener{
	public static WebDriver driver ;
	public ExtentReports report ;
	public static ExtentTest test ;


	@Override
	public void onStart(ISuite suite) {
		Reporter.log("On Suite start", true);
		ExtentSparkReporter spark = new ExtentSparkReporter("./advanceReport/report.html");
		spark.config().setDocumentTitle("CRM test suit");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Riza REport");
		
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows") ;
		
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("On Suite End" , true);
		report.flush();
	}


	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test = report.createTest(name +" method test");
		test.log(Status.INFO, name+" methos started execution");		
		System.out.println(name+ " method started execution ");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.FAIL, name+" methos failed execution");
		System.out.println(name+ " method  execution failed ");
		TakesScreenshot ts = (TakesScreenshot)driver ;
		String ss =  ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(ss);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.PASS, name+" methos Passed execution");
		System.out.println(name+ " method  execution success ");
		driver.close();
	}


	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}


}
