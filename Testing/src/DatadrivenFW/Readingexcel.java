package DatadrivenFW;

import java.io.FileInputStream;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Readingexcel {
	
	String[][] text=null;
	
	@DataProvider(name = "logintest")
	public String[][] logindata() throws BiffException, IOException{
		text=exceldata();
		return text;
		
	}

	public Sheet SH;
	public String[][] exceldata() throws BiffException, IOException
	{
		FileInputStream FS =new FileInputStream("C:\\Users\\KAVIYARASAN D\\Documents\\Login.xls");
		Workbook WB=Workbook.getWorkbook(FS);
		 SH=WB.getSheet(0);
		int Rowcounnt=SH.getRows();
		int columncount=SH.getColumns();
		
		String data[][]=new String[Rowcounnt-1][columncount];
		
		for(int i=1;i<Rowcounnt;i++)
		{
			for(int j=0;j<columncount;j++)
			{
		data[i-1][j]=SH.getCell(j,i).getContents();		
				
			}
			System.out.println(Rowcounnt+""+columncount);
			
		}
		
		return data;
		
		
		
		
	}
	
	@Test(dataProvider="logintest")
	public void login(String name, String pass){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation supporting files\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU0NzA1NzI1LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		dr.findElement(By.xpath("//*[@id='email']")).sendKeys(name);
		dr.findElement(By.xpath("//*[@id='pass']")).sendKeys(pass);
		
		//Cell cell=SH.getCell(2);
		dr.close();
	}
}
