package objecctRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver ;

	@FindBy(id = "Email")
	private WebElement email ;
	
	@FindBy(id = "Password")
	private WebElement pwd ;
	
	@FindBy(css ="button[type='submit']")
	private WebElement login ;

//	@FindAll({@FindBy(id="Login"), @FindBy(className = "Login") , @FindBy(css ="type#submit") }   )
//	WebElement login ;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
}
