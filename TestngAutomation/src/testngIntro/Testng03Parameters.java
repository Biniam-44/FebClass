package testngIntro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Testng03Parameters {
	
	
	@Parameters({"URL"})
	@Test
	public void Login(String urlName) {
		
		System.out.println("Our URL parmeter that comes from the XML file is " + urlName);
		
	}
	
	@DataProvider
	public Object GetData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "FirstUserName";
		data[0][1]= "FirstPwd";
		
		data[1][0] = "SecondUserName";
		data[1][1]= "SecondPwd";
		
		data[2][0] = "ThirdUserName";
		data[2][1]= "ThirdPwd";
		
		
		return data;
	}
	
	@Test(dataProvider="GetData")
	public void LoginMultipleTimes(String userName, String passWord) {
		
		System.out.println(userName);
		System.out.println(passWord);
		
	}

}
