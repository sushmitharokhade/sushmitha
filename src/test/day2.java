package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 {

	
	
	@Test
	public void mobilelogin()
	{
		System.out.println("MobileLogin");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	@Test(groups={"smoke"})
	public void mobilelogout()
	{
		System.out.println("Mobilelogout");
	}
}
