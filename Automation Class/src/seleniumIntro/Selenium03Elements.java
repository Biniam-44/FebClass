package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium03Elements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		// We create a webdriver object
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Select s = new Select(driver.findElement(By.xpath("//body/form/div/div/div/div/div/div/div/div/div/div/div/select[1]")));
		s.selectByVisibleText("USD");
		s.selectByIndex(0);
		s.selectByValue("AED");
		//driver.findElement(By.xpath("//body/form/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/span[1]")).click();
		//driver.findElement(By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[2]//div[1]//table[1]//tbody[1]//tr[2]//td[2]//div[3]//div[1]//div[1]//ul[1]//li[9]//a[1]")).click();
		//driver.findElement(By.xpath("//body//div//div//div//div//div//div//div//div[2]//div[2]//div[1]//table[1]//tbody[1]//tr[2]//td[2]//div[3]//div[1]//div[1]//ul[1]//li[11]//a[1]")).click();

		
	}

}
