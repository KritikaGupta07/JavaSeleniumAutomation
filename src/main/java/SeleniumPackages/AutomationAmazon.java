package SeleniumPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationAmazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		String str = driver.getTitle();

		System.out.println("Title of the web site is: " + str);

		String curr_URL = driver.getCurrentUrl();

		System.out.println("Current URl : " + curr_URL);

		String pgs = driver.getPageSource();

		System.out.println("Page Source : " + pgs);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kritikagupta07nov@gmail.com");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.quit();

	}

}
