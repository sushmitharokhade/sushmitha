package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
@AfterMethod
public void aftermethod()
{
	System.out.println("after method");
}

	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	@Test(groups={"smoke"})
	public void demo()
	{
		System.out.println("hello");
	}
	
	@BeforeTest
	public void before()
	{
		System.out.println("Before test");
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("after suite");
	}
	@AfterTest
	public void after()
	{
		System.out.println("after test");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	@Test
	public void Ademo2()
	{
		System.out.println("bye");
	}
}
