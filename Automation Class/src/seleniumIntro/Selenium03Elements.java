package seleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;

public class Selenium03Elements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		// We create a webdriver object
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		// Got the currency as a web Element
		WebElement currency = driver.findElement(By.xpath("//body/form/div/div/div/div/div/div/div/div/div/div/div/select[1]"));
		// Used Select class to select the currency
		Select s = new Select(currency);
		s.selectByVisibleText("USD");
		s.selectByIndex(0);
		s.selectByValue("AED");
		
		// Got the selected value from the drop down
		WebElement value = s.getFirstSelectedOption();
		String currencyValue = value.getText();
		
		Assert.assertEquals(currencyValue, "AED");
		// Dynamic drop down
		driver.findElement(By.id("divpaxinfo")).click();
		
		//Static drop down
		Select adultDDL = new Select(driver.findElement(By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div//p[1]//select[1]")));
		adultDDL.selectByVisibleText("2");
		
		Select childDDL = new Select(driver.findElement(By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div//p[2]//select[1]")));
		childDDL.selectByIndex(3);
		
		
		
		// From City
		driver.findElement(By.xpath("//body/form/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/span[1]")).click();
		
		//Select From City
		driver.findElement(By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[2]//div[1]//table[1]//tbody[1]//tr[2]//td[2]//div[3]//div[1]//div[1]//ul[1]//li[9]//a[1]")).click();
		
		// I need to wait for 2 seconds
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
		// Select To City
		driver.findElement(By.xpath("//body//div//div//div//div//div//div//div//div[2]//div[2]//div[1]//table[1]//tbody[1]//tr[2]//td[2]//div[3]//div[1]//div[1]//ul[1]//li[11]//a[1]")).click();

		// Select round trip
		WebElement rtRadioBtn = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		rtRadioBtn.click();
		
		String value1 = rtRadioBtn.getText();
		
		boolean isRTClicked = rtRadioBtn.isSelected(); 
		
		System.out.println(isRTClicked);
		
		Assert.assertTrue(isRTClicked);
	
		// Select Calendar
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		// Select Disabled date
		
		/*
		 driver.findElement(By.xpath("//tr[3]//td[5]//span[1]")).click();
		  
		 * WebElement date = driver.findElement(By.xpath("//tr[3]//td[5]//span[1]"));
		 * String selectedDate = date.getText(); System.out.println(selectedDate);
		 */
		// Select today's date on the calendar
		driver.findElement(By.className("ui-state-highlight")).click();
		
		driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		
		driver.findElement(By.xpath("//body/div/div/table/tbody/tr[3]/td[4]/a[1]")).click();
		
		
		
		
	}

}
