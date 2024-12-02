package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorWithArguments {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement email = driver.findElement(By.id("login-username"));
		
		WebElement checkbox = driver.findElement(By.id("persistent"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.body.style.zoom='75%'");

		//js.executeScript("document.getElementById('login-username').value='Selenium@yahoo.in'");
		// The above can be written with the help of arguments like email is arguments[0] and mukesh@yahoo.in is arguments[1]
		
		js.executeScript("arguments[0].value= arguments[1]",email ,"mukesh@yahoo.in");

		//js.executeScript("document.getElementById('persistent').click()");
		//The above can be written with the help of arguments like checkbox is arguments[0]
		
		js.executeScript("arguments[0].click()", checkbox);
		
		driver.quit();
	}

}
