package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

	public static WebElement waitForWebElement(WebDriver driver, By locator) {

		WebElement element = null;
		
		for (int i = 0; i < 30; i++) {

			try {

				element = driver.findElement(locator);

				if (element.isDisplayed() && element.isEnabled() && element.getSize().getHeight() > 0
						&& element.getSize().getWidth() > 0) {

					highLightElement(driver,element);
					break;
				} 
				else {

					System.out.println("Waiting for WebElement - Waiting for all states...");
				}
			} 
			catch (Exception e) {

				System.out.println("Waiting for WebElement - Retrying...");
			}
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}

		}
		
		return element;

	}
	
	public static void highLightElement(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red;');",element);
		
		try {
			
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
			System.out.println(e.getMessage());
		}
		
		js.executeScript("argument[0].setAttribute('style','border: solid 2px white');", element);
		
	}

}
