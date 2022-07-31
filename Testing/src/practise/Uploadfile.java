package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uploadfile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Automation supporting files\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.navigate().to("http://leafground.com/pages/upload.html");
		Thread.sleep(2000);
		WebElement button=dr.findElement(By.xpath("//input[@name='filename']"));
		Actions act=new Actions(dr);
		
		act.moveToElement(button).click().build().perform();
		Thread.sleep(2000);
		StringSelection sec=new StringSelection("C:\\Users\\KAVIYARASAN D\\Downloads\\logu.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sec, null);
		Thread.sleep(2000);
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
