package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginTestCase3 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		System.out.println("Browser Started....");

		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin89@gmail.com");

		String email = driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).getText();

		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("mukesh123");
		
		String password = driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).getText();

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		if(email.isEmpty()) {
			
			if(password.isEmpty()) {
				
				String error_msg = driver.findElement(By.xpath("//h2[text()=\"USER Email Doesn't Exist\"]")).getText();
						
				System.out.println(error_msg);
			}
		}

		System.out.println("Browser Closed...");

		driver.quit();

	}

}
