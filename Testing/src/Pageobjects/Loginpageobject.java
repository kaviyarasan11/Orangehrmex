package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpageobject {
	
	@FindBy(id="email")
	public static WebElement emailid;
	
	@FindBy(name="pass")
	public static WebElement  password;
	@FindBy(name="login")
	public static WebElement SUBMIT;
	@FindBy(xpath="//*[@id='loginform']/div[2]/div[2]")
	public static WebElement errormsg;
	
	@FindBy(xpath="//*[@id='mount_0_0_uj']/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image")
	public static WebElement profile;
	@FindBy(xpath="//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j fe6kdd0r mau55g9w c8b282yb keod5gw0 nxhoafnm aigsh9s9 d3f4x2em mdeji52x a5q79mjw g1cxx5fr lrazzd5p oo9gr5id hzawbc8m']")
	public static WebElement profilename;
	
}
