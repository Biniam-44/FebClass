package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EaAppHomePage {
	
	WebDriver driver = null;
	
	public EaAppHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By homeLink = By.linkText("Home");
	By registerLink = By.linkText("Register");
	By loginLink = By.linkText("Login");

	public WebElement HomePage() {
		return driver.findElement(homeLink);
	}
	
	public WebElement RegisterationPage() {
		return driver.findElement(registerLink);
	}
	
	public WebElement LoginPage() {
		return driver.findElement(loginLink);
	}
}
