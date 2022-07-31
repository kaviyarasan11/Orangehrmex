package Databaseconeg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Databasecal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://root@localhost/autosele");
		Statement stat=con.createStatement();
		ResultSet result=stat.executeQuery("SELECT * FROM infodata");
		String name = null;
		String pass = null;
		System.setProperty("webdriver.chrome.driver", "D:\\Automation supporting files\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		while(result.next())
		{
			name=result.getString(1);
			pass=result.getString(2);
		
		
		dr.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU0NzA1NzI1LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		dr.findElement(By.xpath("//*[@id='email']")).sendKeys(name);
		dr.findElement(By.xpath("//*[@id='pass']")).sendKeys(pass);
		}
	}

}
