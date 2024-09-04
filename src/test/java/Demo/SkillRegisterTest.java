package Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRegisterTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SkillRegisterPage register = new SkillRegisterPage(driver);
		register.setFirstname("rvitehfgg");
		register.setrePassword("uhjjigghhj");
		register.setLastname("konghjuugghh");
		register.setEmail("ravitejanelapatla@gmail.com");
		register.setPassword("ravi008@");
		register.clickLogin();
		
		Thread.sleep(2000);
		
		driver.quit();


	}

}
