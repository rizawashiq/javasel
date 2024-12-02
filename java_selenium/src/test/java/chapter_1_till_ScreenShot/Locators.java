package chapter_1_till_ScreenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
//		Thread.sleep(4000);
////		driver.findElement(By.partialLinkText("Experience")).click();
////		Thread.sleep(4000);
////		
////		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.name("email"))).sendKeys("HEllo");
//		SearchContext s =  driver.findElement(By.xpath("//div[@class='my-3']")).getShadowRoot();		
//		s.findElement(By.cssSelector("input[type='text']")).sendKeys("HEllo");
//		
//		driver.switchTo().alert().accept();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//		WebDriverWait w = new  WebDriverWait(driver, Duration.ofSeconds(15));
//		w.until(ExpectedConditions.)
		
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.shoppersstack.com/user-signin");
	        Thread.sleep(10000);

	        // Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Execute JavaScript to get an element by its ID
	        js.executeScript("document.getElementById('Email').value='mrizawashiq';");
	        js.executeScript("document.getElementById('Password').value='Riza@2020';");
	        driver.findElement(By.xpath("//span[text()='Login']")).click();
		
//		 WebDriver driver = new ChromeDriver();
	        
	        // Navigate to a page
//	        driver.get("https://www.shoppersstack.com/user-signin");
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	        Thread.sleep(5000);
	        // Locate the text field element using XPath or CSS Selector
//	        WebElement textField = driver.findElement(By.id("Email"));
//	        
//	        // Cast WebDriver to JavascriptExecutor
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        
//	        // Use JavaScript to set the value of the text field
//	        js.executeScript("arguments[0].value='mrizawashiq@gmail.com';", textField);
//	        
//	        textField = driver.findElement(By.id("Password"));
//	        js.executeScript("arguments[0].value='Riza@2020';", textField);
	        
//	        driver.findElement(By.xpath("//span[text()='Login']")).click();
	        
	        
	        // Verify that the value is set
//	        String value = textField.getAttribute("value");
//	        System.out.println("Value entered in the text field: " + value);
		
		
		
		
		
		
		
		
		
		
	}
}
