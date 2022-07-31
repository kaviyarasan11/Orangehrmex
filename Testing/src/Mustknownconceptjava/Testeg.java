package Mustknownconceptjava;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobjects.Loginpageobject;
import graphql.PublicApi;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Testeg {
public static String name;
public static String pass;
	
	public  String[][] exceldata() throws BiffException, IOException
	{
		FileInputStream FS =new FileInputStream("C:\\Users\\KAVIYARASAN D\\Documents\\Login.xls");
		Workbook WB=Workbook.getWorkbook(FS);
		Sheet SH=WB.getSheet(0);
		int Rowcounnt=SH.getRows();
		int columncount=SH.getColumns();
		
		String data[][]=new String[Rowcounnt-1][columncount];
		
		for(int i=1;i<Rowcounnt;i++)
		{
			for(int j=0;j<columncount;j++)
			{
		data[i-1][j]=SH.getCell(j,i).getContents();		
				
			}
			System.out.println(Rowcounnt + "" + columncount);
			
		}
		
		return data;
		
		
		
		
	}
	@Test
	
	public static void main1( String pass, String user) throws BiffException, IOException {
		// TODO Auto-generated method stub

		
		Testeg te=new Testeg();
		te.exceldata();
		System.out.println(pass);
		
		
		
	}
}