package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JSExecutorAssignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://freelance-learn-automation.vercel.app/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin@email.com");

		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("admin@123");

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		Actions actions = new Actions(driver);

		WebElement manageHover = driver.findElement(By.xpath("//span[text()='Manage']"));

		actions.moveToElement(manageHover).perform();

		driver.findElement(By.xpath("//img[@alt = 'manage course']")).click();

		driver.findElement(By.xpath("//button[text()='Add New Course ']")).click();
		
		driver.findElement(By.xpath("//input[@name='thumbnail']")).sendKeys("C:\\Users\\Abhis\\Downloads\\Image.png");

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Selenium With Python");

		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Selenium With Python");

		driver.findElement(By.xpath("//input[@id='instructorNameId']")).sendKeys("Mukesh Otwani");

		driver.findElement(By.xpath("//input[@id='price']")).sendKeys("20000");

		driver.findElement(By.xpath("//input[@name='startDate']")).sendKeys("05/27/2024");

		driver.findElement(By.xpath("//input[@name='endDate']")).sendKeys("08/27/2024");

		driver.findElement(By.xpath("//div[text()='Select Category']")).click();

		driver.findElement(By.xpath("//button[text()='Selenium']")).click();

		driver.findElement(By.xpath("//button[text()='Save']")).click();

		String ele = driver.findElement(By.xpath("//td[text()='Selenium With Python']")).getText();

		if (ele.contains("Selenium With")) {

			System.out.println("Course addded to the list, Hence Verified...");
		} else {

			System.out.println("Please try again , Fail...");
		}

		driver.findElement(By.xpath("//button[text()='Delete'][1]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		if (ele.contains("Selenium With")) {

			System.out.println("Course deleted from the list, Hence Verified...");
		} 
		else {

			System.out.println("Please try again , Fail...");
		}
		
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();

		driver.quit();

	}

}
