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
import pageObjects.EaAppLoginPage;

public class EaAppLoginNegative {
	
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
	public void ClickLogin() {
		EaAppHomePage hp = new EaAppHomePage(driver);
		hp.LoginPage().click();
	}
	@Test
	public void InvalidLogin() {
		EaAppLoginPage lp = new EaAppLoginPage(driver);
		lp.UserNameLogin().sendKeys("invalidUsername");
		lp.PwdLogin().sendKeys("InvalidPwd");
		lp.RememberMe().click();
		lp.LoginBtn().click();
		String invalidLoginActual = lp.InvalidLoginError().getText();
		String invalidLoginExpected = "Invalid login attempt.";
		Assert.assertEquals(invalidLoginActual, invalidLoginExpected);
	}


}
