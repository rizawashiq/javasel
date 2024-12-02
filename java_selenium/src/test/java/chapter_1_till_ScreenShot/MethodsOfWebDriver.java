package chapter_1_till_ScreenShot;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.shoppersstack.com/sub-category/men-tshirt");
		Thread.sleep(2000);
		System.out.println("Title is " + driver.getTitle());
		System.out.println("===================================");
		driver.navigate().back();
		Thread.sleep(2000);
		
		System.out.println("URL is " + driver.getCurrentUrl());
		System.out.println("===================================");
		System.out.println("PAge source is " + driver.getPageSource());
		System.out.println("===================================");
		System.out.println("current window handle is " + driver.getWindowHandle());
		System.out.println("===================================");
		Set<String> handles = driver.getWindowHandles();
		for(String x : handles)
			System.out.println(x);	
		System.out.println("===================================");
		System.out.println("Title is " + driver.getTitle());
		System.out.println("===================================");
		
		
		
		
		
		
		
		
	}
}
