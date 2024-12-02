package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://freelance-learn-automation.vercel.app/signup");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		boolean status = wait.until(ExpectedConditions.titleContains("Automation"));
		
		if(status) {
			
			System.out.println("Found...");
		}
		
		else {
			
			System.out.println("Please try again...");
		}

		driver.quit();

	}

}
