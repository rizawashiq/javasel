package extentreports;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(extentreports.ListenerUtil.class)
public class TestClass {
	@Test
	public void demo1() throws InterruptedException {
//		System.out.println("Demo1 method ====== starts");
		Reporter.log("Demo1 method ====== starts" , true);
		Thread.sleep(3000);
		SoftAssert a = new SoftAssert();
		a.assertEquals(10, 10);
		System.out.println("Demo1 method ====== ends");
		Reporter.log("Demo1 method ====== ends");
		a.assertAll();
	}
	
	
}
