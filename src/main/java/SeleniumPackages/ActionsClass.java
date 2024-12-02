package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).perform();
		
		/*
		 * WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		 * 
		 * WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		 * 
		 * act.click();
		 * 
		 * act.click(src);
		 * 
		 * act.doubleClick();
		 * 
		 * act.doubleClick(dest);
		 * 
		 *right click
		 *act.contextClick();
		 *
		 *act.contextClick(src);
		 *
		 * 
		 *act.clickAndHold(src).moveToElement(dest).release().build().perform();
		 *
		 *act.clickAndHold(src).pause(2000).moveToElement(dest).pause(2000).release().build().perform();
		 *
		 *
		 *
		 *act.scrollToElement(driver.findElement(By.xpath(""))).perform(); // for scrolling
		 *
		 *
		 *
		 */
		
		
		
		
		driver.quit();
	}

}
