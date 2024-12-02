package forjenkins;

import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class ClassA extends BaseClass {
	
	@Test(groups = "odd")
	public void A1() throws InterruptedException {
		BaseClass.driver.navigate().to("https://www.shoppersstack.com/");
		Thread.sleep(3000);
	}
	
	@Test(groups = "even")
	public void A2() throws InterruptedException {
		BaseClass.driver.navigate().to("https://www.qspiders.com/");
		Thread.sleep(3000);
	}

}
