package listners;

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

public class ListenerUtility implements ITestListener , ISuiteListener {
	public static WebDriver driver ;
	
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		System.out.println(name+ " method started execution ");
		ListenerUtility.driver=new ChromeDriver();
		ListenerUtility.driver.get("https://demo.guru99.com/");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		System.out.println(name+ " method  execution failed ");
		TakesScreenshot ts = (TakesScreenshot)driver ;
		File src =  ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\User\\Desktop\\Selenium\\java_selenium\\screenShot\\error.png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		System.out.println(name+ " method  execution success ");
		driver.close();
	}
	
	@Override
	public void onStart(ISuite suite) {
		System.out.println("On start");
	}
	
	@Override
	public void onFinish(ISuite suite) {
		System.out.println("On Finish");
	}
	
	
	
	
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	
	
}
