package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		driver.findElement(By.xpath("//input[@value='Show me']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("passnew")));

		ele.sendKeys("selenium");

		driver.quit();
	}

}
