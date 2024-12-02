package BreakOutSessionCreateEnd2End;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HelperMain {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		String parent = driver.getWindowHandle();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(" https://freelance-learn-automation.vercel.app/");

		driver.findElement(By.xpath("//img[@alt='menu']")).click();

		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='New user? Signup']")).click();

		int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();

		if (count > 5) {

			System.out.println("Yes, the count is greater than 5 and the count is " + count);
		} else {

			System.out.println("The count is less than 5 and the count is " + count);
		}

		driver.navigate().back();

		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin@email.com");

		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("admin@123");

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//span[text()='Manage']"))).perform();

		driver.findElement(By.xpath("//a[normalize-space()='Manage Categories']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Set<String> allWindows = driver.getWindowHandles();

		for (String handles : allWindows) {

			if (!parent.equals(handles)) {

				System.out.println(driver.getCurrentUrl());

				driver.switchTo().window(handles);

				System.out.println(driver.getCurrentUrl());

				driver.findElement(By.xpath("//img[@alt='add']")).click();
			}
		}

		Thread.sleep(1000);

		Alert alert = driver.switchTo().alert();

		String inputText = "Azure DevOps";

		alert.sendKeys(inputText);

		alert.accept();

		boolean status = driver.findElement(By.xpath("//td[text()='" + inputText + "']")).isDisplayed();

		if (status) {

			System.out.println("Validation Pass...");

		} else {

			System.out.println("Validation Fail- Please try again...");
		}

		driver.findElement(By.xpath("//img[@alt='menu']")).click();

		driver.findElement(By.xpath("//button[text()='Sign out']")).click();

		driver.close();

		driver.switchTo().window(parent);

		driver.get("https://freelance-learn-automation.vercel.app/");

		driver.findElement(By.xpath("//img[@alt='menu']")).click();

		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='New user? Signup']")).click();

		if (driver.findElement(By.xpath("//label[text()='" + inputText + "']")).isDisplayed()) {

			System.out.print("Catergory is present in registration page");

		} else {

			System.out.print("Catergory isnot  present in registration page");

		}

		driver.navigate().back();

		driver.findElement(By.xpath("//img[@alt='menu']")).click();

		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("admin@email.com");

		driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("admin@123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//img[@alt='delete']")).click();

		action.moveToElement(driver.findElement(By.xpath("//span[text()='Manage']"))).perform();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//img[@alt='manage category']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Set<String> allWindowsNew = driver.getWindowHandles();

		for (String handle : allWindowsNew) {

			if (!parent.equals(handle)) {

				System.out.println(driver.getCurrentUrl());

				driver.switchTo().window(handle);

				System.out.println(driver.getCurrentUrl());

				driver.findElement(
						By.xpath("//tbody/tr/td[text()='" + inputText + "']/following-sibling::td/child::button"))
						.click();

				driver.findElement(By.xpath("//button[text()='Delete']")).click();

			}
		}

		Thread.sleep(1000);

		boolean delete_status = driver.findElement(By.xpath("//td[text()='" + inputText + "']")).isDisplayed();

		if (delete_status) {

			System.out.println(inputText + " deleted from the list.");
		} else {

			System.out.println(inputText + " is not deleted from the list.");
		}

		driver.findElement(By.xpath("//img[@alt='menu']")).click();

		driver.findElement(By.xpath("//button[text()='Sign out']")).click();

		driver.close();

		driver.switchTo().window(parent);

		driver.get("https://freelance-learn-automation.vercel.app/");

		driver.findElement(By.xpath("//img[@alt='menu']")).click();

		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='New user? Signup']")).click();

		if (driver.findElement(By.xpath("//label[text()='" + inputText + "']")).isDisplayed()) {

			System.out.print("Catergory is present in registration page");

		} else {

			System.out.print("Catergory is not present in registration page");

		}

		driver.quit();

	}

}
