package SeleniumPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()= 'Login']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'New to Flipkart? Create an account']")).click();
		
		Thread.sleep(2000);
		
		String str = driver.getTitle();
		
		System.out.println(str.contains("Shopping"));
		
		driver.quit();
	}

}
