package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.EaAppHomePage;
import pageObjects.EaAppRegisterationPage;

public class EaAppRegister {
	
	WebDriver driver = null;
	 
	@BeforeTest
	public void StartUp() throws IOException {
		
		Properties prop  = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\nebiy\\eclipse-workspace\\FebClass\\POMFramework\\src\\data.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\FirefoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void ClickRegister() {
		EaAppHomePage homePage = new EaAppHomePage(driver);
		homePage.RegisterationPage().click();
	}
	
	@Test
	public void ValidationCheck() throws InterruptedException {
		EaAppRegisterationPage rp = new EaAppRegisterationPage(driver);
		rp.RegisterBtn().click();
		
		Thread.sleep(1000);
		// It will validate if the user name validation error exists
		String unValidationActual = rp.UserNameValidation().getText();
		String unValidationExpected = "The UserName field is required.";
		
		// It will validate if password validation error exists
		String pwdValidationActual = rp.PassWordValidation().getText();
		String pwdValidationExpected = "The Password field is required.";
		
		// It will validate if email validation error exists
		String emailValidationActual = rp.EmailValidation().getText();
		String emailvalidationExpected = "The Email field is required.";
		
		Assert.assertEquals(unValidationActual, unValidationExpected);
		Assert.assertEquals(pwdValidationActual, pwdValidationExpected);
		Assert.assertEquals(emailValidationActual, emailvalidationExpected);
		
		rp.UserName().sendKeys("myusername");
		rp.RegisterBtn().click();
		
		Assert.assertEquals(pwdValidationActual, pwdValidationExpected);
		Assert.assertEquals(emailValidationActual, emailvalidationExpected);
		
		rp.PassWord().sendKeys("mypassword");
		rp.RegisterBtn().click();
		Assert.assertEquals(emailValidationActual, emailvalidationExpected);
	}
	
	
	public void ValidationCheckOnlyPwdEmail() {
		EaAppRegisterationPage rp = new EaAppRegisterationPage(driver);
		rp.UserName().sendKeys("myusername");
		rp.RegisterBtn().click();
		
		// It will validate if password validation error exists
		String pwdValidationActual = rp.PassWordValidation().getText();
		String pwdValidationExpected = "The Password field is required.";
		
		// It will validate if email validation error exists
		String emailValidationActual = rp.EmailValidation().getText();
		String emailvalidationExpected = "The Email field is required.";
		

		Assert.assertEquals(pwdValidationActual, pwdValidationExpected);
		Assert.assertEquals(emailValidationActual, emailvalidationExpected);
	}
	
	
	

}
