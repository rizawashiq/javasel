package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import objecctRepo.LoginPage;

public class CrossBrowser {
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void BS(String browser) throws InterruptedException {
		if(browser.equals("chrome"))
			driver = new ChromeDriver();
		else if(browser.equals("firefox"))
			driver = new FirefoxDriver();
		else
			driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(10000);
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("mrizawashiq@gmail.com");
		lp.getPwd().sendKeys("Riza@2020");
		lp.getLogin().click();
		Reporter.log("Logged in SucesFully");
	}
	
	@Test
	public void test2() throws InterruptedException {
		driver.get("http://localhost:8080/login?from=%2F");
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void as() {
		driver.close();
	}
}
