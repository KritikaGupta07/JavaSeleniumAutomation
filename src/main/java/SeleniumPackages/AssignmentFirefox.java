package SeleniumPackages;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentFirefox {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.selenium.dev/");

		Thread.sleep(5000);

		String title = driver.getTitle();

		System.out.println("Title from Firefox browser : " + title);

		if (title.equalsIgnoreCase("Selenium")) {

			System.out.println("Test Passed");
		} else {

			System.out.println("Failed... Please try again");
		}

		driver.close();

	}

}
