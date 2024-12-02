package SeleniumPackages;

import org.openqa.selenium.edge.EdgeDriver;

public class AssignmentEdge {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();

		driver.get("https://www.selenium.dev/");

		Thread.sleep(5000);

		String title = driver.getTitle();

		System.out.println("Title from Edge Browser : " + title);

		if (title.equalsIgnoreCase("Selenium")) {

			System.out.println("Test Passed");
		} else {

			System.out.println("Failed... Please try again");
		}

		driver.close();
	}

}
