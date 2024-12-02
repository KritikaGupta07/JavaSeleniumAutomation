package SeleniumPackages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Select state = new Select(driver.findElement(By.id("state")));
		
		List<WebElement> allStates = state.getOptions();
		
		List<String> actualList = new ArrayList<String>();
		
		for(WebElement ele : allStates) {
			
			//System.out.println(ele.getText());
			
			String stateName = ele.getText();
			
			actualList.add(stateName);
		}
		
		List<String> expectedList = new ArrayList<String>();
		
		expectedList.addAll(actualList);
		
		Collections.sort(expectedList);
		
		System.out.println("Actual List : " + actualList);
		
		System.out.println("Expected List : " + expectedList);
		
		if(expectedList.equals(actualList)) {
			
			System.out.println("Validation Passed");
		}
		
		else {
			
			System.out.println("Validation Fail...");
		}
		
		driver.quit();
	}

}
