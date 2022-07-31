package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobjects.Loginpageobject;

public class LoginTestcase {
	
	public static WebDriver dr;
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		
		ChromeOptions cop=new ChromeOptions();
		cop.addArguments("--start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation supporting files\\chromedriver_win32\\chromedriver.exe");
		 dr=new ChromeDriver(cop);
		dr.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU0NzA1NzI1LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		
		PageFactory.initElements(dr, Loginpageobject.class);
		Thread.sleep(3000);
		Loginpageobject.emailid.sendKeys("9445515812");
		Loginpageobject.password.sendKeys("kavi1993@");
		Loginpageobject.SUBMIT.click();
		//System.out.println(Loginpageobject.errormsg.getText());
		Loginpageobject.profile.click();
		System.out.println(Loginpageobject.profilename.getText());
	}
	
	@Test(priority=2)
	public void launchchrome()
	{
		
		ChromeOptions cop=new ChromeOptions();
		cop.addArguments("--start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation supporting files\\chromedriver_win32\\chromedriver.exe");
		 dr=new ChromeDriver(cop);
		 dr.get("https://www.google.com/");
		
		
	}
	

}
