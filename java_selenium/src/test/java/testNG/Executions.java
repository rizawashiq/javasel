package testNG;
import org.testng.annotations.Test;

public class Executions {
	@Test(groups = "A")
	public void demo1() {
		System.out.println("This is Smoke");
	}
	
	@Test(groups = "B" , invocationCount =  2)
	public void demo2() {
		System.out.println("This is Regression");
	}
	
	@Test(groups = "A")
	public void demo3() {
		System.out.println("This is Smoke");
	}
	
	@Test(groups = "B")
	public void demo4() {
		System.out.println("This is Regression");
	}
}
