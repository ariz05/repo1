package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class HomePage {
	
	private static WebElement element = null;
	
	/*public static WebElement lnk_SignIn(WebDriver driver)
	{
		element = driver.findElement(By.id("signInHeaderLink"));
		Log.info("Sign In Link found on HomePage ");
		return element;
		
	}*/
	
	public static WebElement lnk_MyAccount(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='myAccountHeaderLink']"));
		Log.info("My Account Link found on HomePage ");
		return element;
		
	}
	
	public static WebElement lnk_Logout(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='signOutHeaderLink']"));
		Log.info("LogOut Link found on HomePage ");
		return element;
		
	}
	
	/*public static WebElement lnk_Help(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='helpHeaderLink']"));
		Log.info("Help Link found on HomePage ");
		return element;
		
	}*/
	
	public static WebElement lnk_LiveTv(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='tv-show-hide']/a[4]"));
		Log.info("LiveTv Link found on HomePage ");
		return element;
		
	}
}
