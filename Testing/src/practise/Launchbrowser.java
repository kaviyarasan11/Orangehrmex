package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("welcome");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation supporting files\\chromedriver_win32\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.navigate().to("https://www.google.com");
		String title=wb.getTitle();
		System.out.println(title);
		WebElement search=wb.findElement(By.name("q"));
		search.sendKeys("sel");
		Thread.sleep(3000);
		List<WebElement> text=wb.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.print(text.size());
		for (WebElement webElement : text) {
			if(webElement.getText().equals("selenium"))
			{
				
				webElement.click();
			}
			
		}
		

	}

}
