package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*
		WebElement element = driver.findElement(By.id("persistent"));
		
		System.out.println(element.getSize().getHeight());
		
		System.out.println(element.getSize().getWidth());
		
		*/
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('login-username').value='Selenium@yahoo.in'");
		
		js.executeScript("document.getElementById('persistent').click()");
		
		driver.quit();

	}

}
