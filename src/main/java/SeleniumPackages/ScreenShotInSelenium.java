package SeleniumPackages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenShotInSelenium {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE); // temp location
		
		System.out.println(src.getAbsolutePath());
		
		File dest = new File("./ScreenShots/ScreenShot1.png");
		
		try{
			
			FileHandler.copy(src,dest);
		}
		
		catch(IOException e) {
			
			System.out.println("ScreenShot failed " + e.getMessage());
		}
		
		driver.quit(); 
	}

}
