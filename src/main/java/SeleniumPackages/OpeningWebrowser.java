package SeleniumPackages;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningWebrowser {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.close();

	}

}
