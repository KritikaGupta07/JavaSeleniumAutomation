package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		
		driver.findElement(By.xpath("//span[text()='Login/ Sign Up']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		//not recommended
		//driver.switchTo().frame(0);
				
		// name or id - recommended only if u found this
		//driver.switchTo().frame("frame1"); 
		
		int frames = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(frames + " Frame count...");
		
		WebElement frameElement = driver.findElement(By.className("modalIframe"));
		
		// Recommended - first find frame then switch 
		driver.switchTo().frame(frameElement); 
		
		//driver.switchTo().parentFrame(); // not recommended 
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("7777888899");
		
		driver.switchTo().defaultContent(); // main page
		
		driver.switchTo().window(driver.getWindowHandle());
		
		driver.switchTo().alert().accept();
		
		driver.quit();

	}

}
