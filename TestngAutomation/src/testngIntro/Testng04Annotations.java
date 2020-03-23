package testngIntro;


import org.testng.annotations.*;

public class Testng04Annotations {
	
	@Test
	public void Method1() {
		System.out.println("I am Method1");
	}
	
	@Test
	public void Method2() {
		System.out.println("I am Method2");
	}
	
	@Test
	public void Method3() {
		System.out.println("I am Method3");
	}
	
	@Test
	public void Method4() {
		System.out.println("I am Method4");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("I ran always before any test");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("I ran always after any test");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("I ran before every method");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("I ran after every method");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("I ran before the class execution starts");
	}

}
