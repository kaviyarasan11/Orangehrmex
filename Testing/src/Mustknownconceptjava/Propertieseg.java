package Mustknownconceptjava;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertieseg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fs=new FileInputStream("Proper.properties");
		Properties pro=new Properties();
		pro.load(fs);
		String brow=pro.getProperty("browser");
		String driv=pro.getProperty("driver");
		String url=pro.getProperty("url");
		if (brow.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driv);
			WebDriver dr=new ChromeDriver();
			dr.get(url);			
		}
		
	}

}
