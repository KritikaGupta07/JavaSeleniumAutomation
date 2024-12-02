package BreakOutSessionNew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class TestCases {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://freelance-learn-automation.vercel.app/login";

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[normalize-space()='New user? Signup']")).click();

		String signUpUrl = driver.getCurrentUrl();

		if (signUpUrl.contains("signup")) {

			System.out.println("---URL Matches and we are on signup page---");
		} else {

			System.out.println("--Not a valid URL--");
		}

		boolean flag = driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();

		if (!flag) {

			System.out.println("signUp Button is disabled");

		} else {

			System.out.println("signUp Button is enabled");
		}

		Faker faker = new Faker();

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(faker.name().fullName());

		String attributeName = driver.findElement(By.xpath("//input[@id='name']")).getAttribute("value");

		System.out.println("Attribute is " + attributeName);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(faker.internet().emailAddress());

		String attributeemail = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");

		System.out.println("Attribute is " + attributeemail);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(faker.internet().password());

		String attributePassword = driver.findElement(By.xpath("//input[@id='password']")).getAttribute("value");

		System.out.println("Attribute is " + attributePassword);

		driver.findElement(By.xpath("//label[text()='SQL']")).click();

		driver.findElement(By.xpath("//label[text()='Selenium']")).click();

		driver.findElement(By.xpath("//input[@name='gender' and @id='gender2']")).click();

		Select select = new Select(driver.findElement(By.xpath("//select[@name='state']")));

		select.selectByVisibleText("Gujarat");

		Select select1 = new Select(driver.findElement(By.xpath("//select[@name='hobbies']")));

		select1.selectByVisibleText("Playing");

		select1.selectByVisibleText("Reading");

		if (driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled()) {

			System.out.println("Signup button is enabled");

			driver.findElement(By.xpath("//button[text()='Sign up']")).click();

		} else {

			System.out.println("Signup button is not enabled");
		}

		Thread.sleep(2000);

		String signUpMessage = driver.findElement(By.xpath("//div[text()='Signup successfully, Please login!']"))
				.getText();

		boolean display = driver.findElement(By.xpath("//div[text()='Signup successfully, Please login!']"))
				.isDisplayed();

		System.out.println("SignUp Message=" + signUpMessage);

		if (display) {

			System.out.println("proceed with login using newly created user");

			driver.findElement(By.id("email1")).sendKeys(attributeemail);

			driver.findElement(By.id("password1")).sendKeys(attributePassword);

			driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();

		} else {

			System.out.println("Signup is not done");
		}
		
		driver.quit();

	}

}
