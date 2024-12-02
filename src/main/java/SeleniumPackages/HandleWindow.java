package SeleniumPackages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window Handle " + parentWindow);
		
		driver.findElement(By.xpath("//div[@id='login_container']//a[contains(@href,'linkedin')]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println(allWindows);
		
		System.out.println(allWindows.size());
		
		List<String> windowInList = new ArrayList<String>(allWindows);
		
		String childWindow = windowInList.get(1);
		
		driver.switchTo().window(childWindow);
		
		if(driver.getTitle().contains("LinkedIn")) {
			
			System.out.println("Switched to child window");
		}
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		driver.quit();

	}

}
