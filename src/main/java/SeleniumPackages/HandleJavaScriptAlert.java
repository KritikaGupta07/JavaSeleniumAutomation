package SeleniumPackages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.xpath("//input[@title='Sign in']")).click();

		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();

		String text = alt.getText();

		System.out.println(text);

		alt.accept(); // ok-continue, proceed

		// alt.dismiss(); //no,stop,cancel

		// alt.sendKeys("admin@123"); //Works with prompt

		// String text = alt.getText();

		// System.out.println(text);
		
		driver.findElement(By.id("password")).sendKeys("mukesh");

		if (text.contains("Please enter a valid user name")) {

			System.out.println("Verified alert text");
		} 
		else {

			System.out.println("Alert text mismatched...");
		}

		driver.quit();
	}

}
