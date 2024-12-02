package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
				
		// it will wait max to max 5 sec before throwing any exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Select state = new Select(driver.findElement(By.id("state")));
		
		// do not recommended
		state.selectByIndex(2);
		
		//second preference
		state.selectByValue("Goa");
		
		//visible text first preference
		state.selectByVisibleText("Karnataka");
		
		String name = state.getFirstSelectedOption().getText();
		
		System.out.println(name);
		
		Select hobbies = new Select(driver.findElement(By.xpath("//select[contains(@id,'hobbi')]")));
		
		hobbies.selectByVisibleText("Playing");
		
		hobbies.selectByVisibleText("Dancing");
		
		hobbies.deselectAll();
		
		hobbies.deselectByVisibleText("Dancing");
				
		driver.quit();
		
	}

}
