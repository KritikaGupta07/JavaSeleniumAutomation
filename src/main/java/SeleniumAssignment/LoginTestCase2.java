package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		System.out.println("Browser Started....");

		driver.get("https://freelance-learn-automation.vercel.app/login");

		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("");

		String email = driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).getText();

		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("admin");

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		if (email.isEmpty()) {

			String error_msg = driver.findElement(By.xpath("//h2[text()='Email is required']")).getText();

			System.out.println(error_msg);
		}

		System.out.println("Browser Closed...");

		driver.quit();
	}

}
