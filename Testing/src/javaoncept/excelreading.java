package javaoncept;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import net.bytebuddy.asm.Advice.Return;

public class excelreading {

	
	
	//return data;
	
	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream FS =new FileInputStream("C:\\Users\\KAVIYARASAN D\\Documents\\Login1.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(FS);
		XSSFSheet sh =wb.getSheetAt(0);
		int rowcount =sh.getLastRowNum()-sh.getFirstRowNum();
		//int columncount=sh.getcoli();
		//sh.get
		//System.out.println("" + rowcount+ columncount);
		
		for(int i=1;i<rowcount;i++)
		{
			
		String username=sh.getRow(i).getCell(0).getStringCellValue();
	String Pass=sh.getRow(i).getCell(1).getStringCellValue();
			
				
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation supporting files\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU0NzA1NzI1LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		dr.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		dr.findElement(By.xpath("//*[@id='pass']")).sendKeys(Pass);
		dr.close();
		//System.out.println(text);
			
	}

	}}
