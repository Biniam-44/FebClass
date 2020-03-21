package seleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium04Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement alertBtn = driver.findElement(By.id("alertbtn"));
		WebElement nameText = driver.findElement(By.id("name"));
		
		nameText.sendKeys("Nebyou");
		
		
		alertBtn.click();
		
		Alert switchAlert = driver.switchTo().alert();
		
		String alertMessage = switchAlert.getText();
		
		String expectedMessage = "Hello Nebyou, share this practice page and share your knowledge";
		
		Assert.assertEquals(alertMessage, expectedMessage);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		switchAlert.accept();
		

	}

}
