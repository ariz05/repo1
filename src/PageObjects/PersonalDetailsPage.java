package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class PersonalDetailsPage {
	private static WebElement element = null;
	//Title
	public static WebElement lst_Title(WebDriver driver)
	{
		element = driver.findElement(By.id("title"));
		Log.info("Title dropdown Link found on Personal Details Page  ");
		return element;
    
}
	//FirstName
	public static WebElement txtbx_FirstName(WebDriver driver)
	{
		element = driver.findElement(By.id("firstName"));
		Log.info("First Name TextBox found on Personal Details Page  ");
		return element;

}
	//LastName
	public static WebElement txtbx_LastName(WebDriver driver)
	{
		element = driver.findElement(By.id("lastName"));
		Log.info("Last Name TextBox found on Personal Details Page  ");
		return element;

}
	//Gender
	public static WebElement lst_Gender(WebDriver driver)
	{
		element = driver.findElement(By.id("gender"));
		Log.info("Gender dropdown Link found on Personal Details Page  ");
		return element;
    
}
	//AnniversaryDay
	public static WebElement lst_AnniversaryDay(WebDriver driver)
	{
		element = driver.findElement(By.id("anniversaryDay"));
		Log.info("Anniversary Day dropdown Link found on Personal Details Page  ");
		return element;
    
}
	//AnniversaryMonth
		public static WebElement lst_AnniversaryMonth(WebDriver driver)
		{
			element = driver.findElement(By.id("anniversaryMonth"));
			Log.info("Anniversary Month dropdown Link found on Personal Details Page  ");
			return element;
	    
	}
		//AnniversaryYear
				public static WebElement lst_AnniversaryYear(WebDriver driver)
				{
					element = driver.findElement(By.id("anniversaryYear"));
					Log.info("Anniversary Year dropdown Link found on Personal Details Page  ");
					return element;
			    
			}
				
				//dobDay
				public static WebElement lst_DobDay(WebDriver driver)
				{
					element = driver.findElement(By.id("dobDay"));
					Log.info("dob Day dropdown Link found on Personal Details Page  ");
					return element;
			    
			}
				//dobMonth
				public static WebElement lst_DobMonth(WebDriver driver)
				{
					element = driver.findElement(By.id("dobMonth"));
					Log.info("dob Month dropdown Link found on Personal Details Page  ");
					return element;
			    
			}
				
				//dobYear
				public static WebElement lst_DobYear(WebDriver driver)
				{
					element = driver.findElement(By.id("dobYear"));
					Log.info("dob Year dropdown Link found on Personal Details Page  ");
					return element;
			    
			}
				
				//AnnualIncome
				public static WebElement lst_AnnualIncome(WebDriver driver)
				{
					element = driver.findElement(By.id("annualIncome"));
					Log.info("Annual Income dropdown Link found on Personal Details Page  ");
					return element;
			    
			}
				//SaveInfo Button
				public static WebElement btn_SaveInfo(WebDriver driver)
				{   
					element = driver.findElement(By.xpath("//*[@id='editMyProfile']/div[3]/div[2]/ul/li[1]/a"));
					Log.info("Save Info Button found");
					return element;
					
				}
				//Back Button
				public static WebElement btn_Back(WebDriver driver)
				{
					element = driver.findElement(By.className("btn inactive"));
					Log.info("Back Button found");
					return element;
					
				}
				
}
