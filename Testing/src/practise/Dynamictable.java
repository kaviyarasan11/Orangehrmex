package practise;


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation supporting files\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.navigate().to("http://leafground.com/");
		dr.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[8]/a")).click();
		List<WebElement> row= dr.findElements(By.tagName("tr"));
        int countrow=row.size();
        System.out.println("Row count"+countrow);
        List<WebElement> column= dr.findElements(By.tagName("th"));
        int countcolumn=column.size();
        System.out.println("column count"+countcolumn);
        
       String text= dr.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]")).getText();
System.out.println(text);

List<WebElement>columntext=dr.findElements(By.xpath("//td[2]"));

ArrayList<Integer> num=new ArrayList<>();

for (WebElement webElement : columntext) {
	
	String text1=webElement.getText().replace("%", "");
	
	num.add(Integer.parseInt(text1));
	
	
}
System.out.println(num);


int minimunvalue =Collections.min(num);
System.out.println(minimunvalue);

String finaltext=Integer.toString(minimunvalue)+"%";
System.out.println(finaltext);

String xpath="//td[normalize-space()="+"\""+finaltext+"\""+"]"+"//following::td[1]";
dr.findElement(By.xpath(xpath)).click();
        
	}

}
