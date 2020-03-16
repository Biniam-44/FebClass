package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium02Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		
		// We create a webdriver object
		WebDriver driver = new ChromeDriver();
		driver.get("http://eaapp.somee.com/");
		// Get the element by ID
		driver.findElement(By.id("registerLink")).click();
		System.out.println(driver.getCurrentUrl());
		//Get the element by Link text
		driver.findElement(By.linkText("Login")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("registerLink")).click();
		//Get the element by Name
		driver.findElement(By.name("UserName")).sendKeys("Tester");
		
		// Get the element by xpath
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("password");
		
		//Get the element by cssselector
		driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("testing");

	}

}
