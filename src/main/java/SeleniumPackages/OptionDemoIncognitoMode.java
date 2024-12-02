package SeleniumPackages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionDemoIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--incognito");
		
		opt.addArguments("start-maximized");
		
		opt.addArguments(Arrays.asList("--incognito","start-maximized")); // the above two line can be written using addArguments()
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
