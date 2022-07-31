package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;





   public class Paralleleg {
	   public WebDriver dr;
	   @BeforeSuite
	   public void launch()
	   {
		   System.setProperty("webdriver.chrome.driver", "D:\\Automation supporting files\\chromedriver_win32\\chromedriver.exe");
			 
	   }
	   @Test
	public void test1(){
		   
			 dr=new ChromeDriver();
	System.out.println("Before suite");
	dr.get("http://googel.com/");
	}
	
	@Test
	public void test2()
	{	 dr=new ChromeDriver();
		 	System.out.println("Before suite");
		dr.get("https://in.search.yahoo.com/?fr2=inr");
	}
	@Test
	public void test3()
	{
		 dr=new ChromeDriver();
		System.out.println("Before suite");
		dr.get("https://www.facebook.com/");
	}


}
