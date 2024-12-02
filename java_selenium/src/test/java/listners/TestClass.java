package listners;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listners.ListenerUtility.class)
public class TestClass {
	
	@Test
	public void demo1() throws InterruptedException {
//		System.out.println("Demo1 method ====== starts");
		Reporter.log("Demo1 method ====== starts" , true);
		Thread.sleep(3000);
		Assert.assertEquals(10, 10);
		System.out.println("Demo1 method ====== ends");
		Reporter.log("Demo1 method ====== ends");
	}
	
	
//	@Test
//	public void demo2() {
//		System.out.println("Demo2 method ====== starts");
//		Assert.assertEquals(10, 11);
//		System.out.println("Demo2 method ====== ends");
//	}
	
	
	
}
