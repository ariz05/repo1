package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class MyAccountPage {
	private static WebElement element = null;
	
	public static WebElement navLnk_MyAccount(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='myAccountHeaderLink']"));
		Log.info("MyAccount Link found on MyAccount Page ");
		return element;

}
	public static WebElement navLnk_PersonalDetails(WebDriver driver)
	{
		element = driver.findElement(By.id("myAccountNavigationPersonalDetailsLink"));
		Log.info("PersonalDetails Link found on MyAccount Page ");
		return element;

}
	
}
