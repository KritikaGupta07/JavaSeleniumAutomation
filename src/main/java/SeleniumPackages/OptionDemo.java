package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class OptionDemo {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
