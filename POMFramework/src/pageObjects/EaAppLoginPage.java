package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EaAppLoginPage {
	WebDriver driver;
	
	public EaAppLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	By unLogin = By.id("UserName");
	By pwdLogin = By.id("Password");
	By rememberMe = By.id("RememberMe");
	By loginBtn = By.xpath("//div[4]//div[1]//input[1]");
	By invalidLoginError = By.cssSelector("div.container.body-content:nth-child(2) div.row:nth-child(3) div.col-md-5:nth-child(2) section:nth-child(1) form.form-horizontal div.validation-summary-errors.text-danger:nth-child(2) ul:nth-child(1) > li:nth-child(1)");
	
	public WebElement UserNameLogin() {
		return driver.findElement(unLogin);
	}
	
	public WebElement PwdLogin() {
		return driver.findElement(pwdLogin);
	}
	
	public WebElement RememberMe() {
		return driver.findElement(rememberMe);
	}
	
	public WebElement LoginBtn() {
		return driver.findElement(loginBtn);
	}
	
	public WebElement InvalidLoginError() {
		return driver.findElement(invalidLoginError);
	}

}
