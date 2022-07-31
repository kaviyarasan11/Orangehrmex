package practise;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation supporting files\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.navigate().to("http://leafground.com/");
		dr.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[18]/a")).click();
		dr.findElement(By.xpath("//*[@id='contentblock']/section/div/div/div/a[1]")).click();
		File fs =new File("C:\\Users\\KAVIYARASAN D");
		File[] files=fs.listFiles();
		for (File file : files) {
			if(file.getName().equals(""))
			{
				
				System.out.println("File is downloaded");
			}
		}
		
	}

}
