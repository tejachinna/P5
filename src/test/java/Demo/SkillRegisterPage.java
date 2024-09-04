package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRegisterPage {
	@FindBy(name="firstname")
	private WebElement firstnameTF;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailidTF;
	
	@FindBy(name="repassword")
	private WebElement confirmPWDTF;
	
	@FindBy(name="lastname")
	private WebElement lastnameTF;
	
	@FindBy(xpath = "(//input[@placeholder='Password'])[2]")
	private WebElement passwordTF;
	
	@FindBy(name="signup")
	private WebElement registerTF;
	
	public SkillRegisterPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public void setFirstname(String firstname) {
		firstnameTF.sendKeys(firstname);
	}
	
	
	public void setEmail(String email) {
		emailidTF.sendKeys(email);
	}
	
	public void setrePassword(String repwd) {
		confirmPWDTF.sendKeys(repwd);
	}
	public void setLastname(String lastname) {
		lastnameTF.sendKeys(lastname);
	}
	public void setPassword(String password) {
		passwordTF.sendKeys(password);	
	}
	public void clickLogin() {
		registerTF.click();
	}
	

}
