package objecctRepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ObjectRepTest {
	
	//staleElementReferenceException
	
	
	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/user-signin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(5000);
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("mrizawashiq@gmail.com");
		lp.getPwd().sendKeys("Riza@2020");
		lp.getLogin().click();
		Reporter.log("Logged in SucesFully");
		
		
	}
}
