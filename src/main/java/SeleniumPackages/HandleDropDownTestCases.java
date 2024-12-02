package SeleniumPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownTestCases {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		driver.manage().window().maximize();

		// it will wait max to max 5 sec before throwing any exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Select state = new Select(driver.findElement(By.id("state")));

		List<WebElement> allStateValues = state.getOptions();

		boolean status = false;

		for (WebElement ele : allStateValues) {

			String text = ele.getText();

			if (text.contains("Rajasthan")) {

				System.out.println("State found...");

				status = true;

				break;
			}

		}
		
		if(status) {
			
			System.out.println("State found - Validation Passed...");
		}
		
		else {
			
			System.out.println("Could not find state - Validation Fail...");
		}
		
		driver.quit();

	}

}
