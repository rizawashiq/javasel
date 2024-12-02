package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	@Test
	public void hardAssert() {
		System.out.println("hard MEthod starts");
		Assert.assertEquals(20, 21 , "method failed");
		System.out.println("hard MEthod ends");
	}
	
	@Test
	public void softAssert() {
		System.out.println("soft MEthod starts");
		SoftAssert a = new SoftAssert();
		a.assertTrue(true , "Method failed");
		System.out.println("soft MEthod ends");
	}
}







