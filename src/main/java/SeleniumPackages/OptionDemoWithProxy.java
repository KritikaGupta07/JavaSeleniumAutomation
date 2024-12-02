package SeleniumPackages;

import java.util.Arrays;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionDemoWithProxy {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments(Arrays.asList("--incognito","start-maximize"));
		
		Proxy p = new Proxy();
		
		p.setHttpProxy("https://127.12.18.14:4444");
		
		opt.setCapability("proxy", p);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
