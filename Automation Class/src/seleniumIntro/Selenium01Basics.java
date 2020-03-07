package seleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01Basics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("email")).click();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("email")).sendKeys("My username");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("u_0_b")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		

	}

}
