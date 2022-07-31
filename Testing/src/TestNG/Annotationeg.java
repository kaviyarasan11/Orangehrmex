package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotationeg {
	public WebDriver dr;
	
	
	@BeforeSuite
	public void lanchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation supporting files\\chromedriver_win32\\chromedriver.exe");
		 dr=new ChromeDriver();
		System.out.println("Before suite");
	}
	
	@BeforeMethod
	public void homepage()
	{
		dr.navigate().to("http://leafground.com/");
		System.out.println("Method before");
	}
	@Test(priority=0,enabled=true,groups="apple")
	public void testcase0()
	{
		dr.navigate().to("http://leafground.com/pages/upload.html");
		

		System.out.println("Test case 1");
		
	}
	
	@Test(priority=1 ,enabled=true,dependsOnMethods="testcase0",groups="apple")
	public void testcase1()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=1 ,groups="orange")
	public void testcase3()
	{
		System.out.println("Test case 3");
	}
	@Test(priority=1 ,groups="orange")
	public void testcase4()
	{
		System.out.println("Test case 4");
	}
	
	

	@Test
	@Parameters("Name")
	
	public void testcase5(String name)
	{
		System.out.println("Test case 5"+ name);
	}

	
	@AfterMethod
	public void gotohome()
	{
		dr.navigate().back();
		System.out.println("Method after");
	}
	@AfterSuite
	public void closebrowser()
	{
		dr.close();
		System.out.println("After suite");
	}

}
