package forjenkins;

import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class ClassBTest extends BaseClass {
	
	@Test(groups = "odd")
	public void B1() throws InterruptedException {
		BaseClass.driver.navigate().to("http://localhost:8080/login?from=%2F");
		Thread.sleep(3000);
	}
	
	@Test(groups = "even")
	public void B2() throws InterruptedException {
		BaseClass.driver.navigate().to("https://trainer.qspiders.com/login");
		Thread.sleep(3000);
	}

}
