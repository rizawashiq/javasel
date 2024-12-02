package forjenkins;

import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class ClassB extends BaseClass {
	
	@Test(groups = "odd")
	public void B1() throws InterruptedException {
		BaseClass.driver.navigate().to("https://www.moglix.com/");
		Thread.sleep(3000);
	}
	
	@Test(groups = "even")
	public void B2() throws InterruptedException {
		BaseClass.driver.navigate().to("https://trainer.qspiders.com/login");
		Thread.sleep(3000);
	}

}
