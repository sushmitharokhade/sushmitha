package test;

import org.testng.annotations.Test;

public class day3 {

	
	@Test(groups={"smoke"})
	public void mobiletest2()
	{
		System.out.println("Api test12");
	}
	@Test(dependsOnMethods={"mobiletest2"})
	public void mobiletest()
	{
		System.out.println("Api test1");
	}
	
	@Test
	public void Apitest()
	{
		System.out.println("API test2");
	}
}
