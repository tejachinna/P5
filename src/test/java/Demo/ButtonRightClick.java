package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonRightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e =driver.findElement(By.id("btn30"));
		
		Actions actions=new Actions(driver);
		actions.contextClick(e).perform();
		
		Thread.sleep(2000);
		
	driver.findElement(By.className("py-1 ps-1 hover:bg-orange-300")).click();
		
		driver.quit();
		
	}

}
