package SeleniumPackages;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://learn-automation.com/");
		
		driver.get("http://gmail.com");
		
		driver.get("http://www.google.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		driver.manage().window().fullscreen();
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.manage().timeouts().getPageLoadTimeout();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String ps = driver.getPageSource();
		
		System.out.println(ps);
		
		driver.quit();

	}

}
