package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EaAppRegisterationPage {
	WebDriver driver = null;
	
	public EaAppRegisterationPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By userName = By.xpath("//div//div[2]//div[1]//input[1]");
	By passWord = By.xpath("//div[3]//div[1]//input[1]");
	By confirmPassword = By.xpath("//div[4]//div[1]//input[1]"); 
	By email = By.xpath("//div[5]//div[1]//input[1]");
	By registerBtn = By.xpath("/html[1]/body[1]/div[2]/form[1]/div[6]/div[1]/input[1]");
	By userNameError = By.cssSelector("div.container.body-content:nth-child(2) form.form-horizontal:nth-child(2) div.text-danger.validation-summary-errors:nth-child(4) ul:nth-child(1) > li:nth-child(1)");
	By passWordError = By.cssSelector("div.container.body-content:nth-child(2) form.form-horizontal:nth-child(2) div.text-danger.validation-summary-errors:nth-child(4) ul:nth-child(1) > li:nth-child(2)");
	By emailError = By.cssSelector("div.container.body-content:nth-child(2) form.form-horizontal:nth-child(2) div.text-danger.validation-summary-errors:nth-child(4) ul:nth-child(1) > li:nth-child(3)");
	//body//form//li[3]
	//body//form//li[2]
	public WebElement UserName() {
		return driver.findElement(userName);
	}
	
	public WebElement PassWord() {
		return driver.findElement(passWord);
	}
	
	public WebElement ConfirmPassWord() {
		return driver.findElement(passWord);
	}
	
	public WebElement Email() {
		return driver.findElement(email);
	}
	
	public WebElement RegisterBtn() {
		return driver.findElement(registerBtn);
	}
	
	public WebElement UserNameValidation() {
		return driver.findElement(userNameError);
	}
	
	public WebElement PassWordValidation() {
		return driver.findElement(passWordError);
	}
	
	public WebElement EmailValidation() {
		return driver.findElement(emailError);
	}
	
}
