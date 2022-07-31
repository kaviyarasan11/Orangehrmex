package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Testcases.LoginTestcase;

public class Screenshottest extends LoginTestcase{
	
	@Test 
	public static void takescreebshot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)dr;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File Destination=new File("D:\\test.png");
		FileHandler.copy(source, Destination);
		
	}

}
