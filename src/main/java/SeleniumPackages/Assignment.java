package SeleniumPackages;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		
		System.out.println("Title : " + title);
		
		if(title.equalsIgnoreCase("Selenium")) {
			
			System.out.println("Test Passed");
		}
		else {
			
			System.out.println("Failed... Please try again");
		}
		
		driver.close();
		
	}

}
