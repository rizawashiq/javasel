package forjenkins;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import BaseClass.BaseClass;

@Listeners(BaseClass.class)
public class ClassATest extends BaseClass {
	
	@Test(groups = "odd")
	public void A1() throws InterruptedException {
		String x = System.getProperty("data");
		BaseClass.driver.navigate().to("https://www.shoppersstack.com/");
		Thread.sleep(3000);
		System.out.println(x);
		BaseClass.test.log(Status.INFO, x);
	}
	
	@Test(groups = "even")
	public void A2() throws InterruptedException {
		BaseClass.driver.navigate().to("https://www.qspiders.com/");
		Thread.sleep(3000);
//		System.out.println(System.getProperty("x"));
	}

}
