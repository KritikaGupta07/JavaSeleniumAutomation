package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsInSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Page Load : " + driver.manage().timeouts().getPageLoadTimeout().getSeconds());
		
		System.out.println("Script Timeout : " + driver.manage().timeouts().getScriptTimeout().getSeconds());
		
		System.out.println("Implicit Wait : " + driver.manage().timeouts().getImplicitWaitTimeout().getSeconds());
		
		Timeouts time = driver.manage().timeouts();
		
		time.pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
