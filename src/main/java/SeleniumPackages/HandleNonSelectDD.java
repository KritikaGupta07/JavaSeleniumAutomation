package SeleniumPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNonSelectDD {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[normalize-space()='Tutorials']")).click();
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//li[@role='presentation']"));
		
		//click on first
		//allOptions.get(0).click();
		
		//allOptions.get(allOptions.size()).click();  // It will throw an exception because index starts from 0 and ends at length - 1
		
		// click on last
		//allOptions.get(allOptions.size() - 1).click(); // It will work
		
		for(WebElement ele : allOptions) {
			
			//System.out.println(ele.getText());
			
			String elementText = ele.getText();
			
			if(elementText.contains("JavaScript")) {
				
				ele.click(); 
				
				break;
			}
		}
		
		driver.quit();
	}

}
