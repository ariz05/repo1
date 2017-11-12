package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class LogInPage {
	
	private static WebElement element =null;
	
	public static WebElement txtbx_Username(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='loginId']"));
		Log.info("UserNAme Text box found ");
		return element;
		
	}

	
	public static WebElement txtbx_Password(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='password']"));
		Log.info("Password Text box found ");
		return element;
		
	}
	
	public static WebElement btn_SignIn(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='signin']"));
		Log.info("Sign In Button found");
		return element;
		
	}
	
	public static WebElement lnk_SignUp(WebDriver driver)
	{
		element = driver.findElement(By.id(".//*[@id='loginform']/div/h3/a"));
		Log.info("Sign Up Button found ");
		return element;
		
	}
	
	public static WebElement lnk_ForgotPwd(WebDriver driver)
	{
		element = driver.findElement(By.id(".//*[@id='forgotPwd']"));
		Log.info("Forgot Password Link found ");
		return element;
		
	}
	
	public static WebElement txtbx_MobileNumber(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='mobileNumber']"));
		Log.info("Mobile number TextBox ");
		return element;
		
	}
	
	public static WebElement btn_ContinueSignUp(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='signUpCont']"));
		Log.info("Continue Button found");
		return element;
		
	}
	
		
	
	public static WebElement txtbx_NewUserPwd(WebDriver driver)
	{
		element = driver.findElement(By.id("newpassword"));
		Log.info("New Password Text box found ");
		return element;
		
	}
	
	public static WebElement txtbx_NewUserConfirmPwd(WebDriver driver)
	{
		element = driver.findElement(By.id("confirmPassword"));
		Log.info("New Password confirmation Text box found ");
		return element;
		
	}
	
	/*
	  public static WebElement rad_NewUser(WebDriver driver)
	 
	{
		element = driver.findElement(By.id("new_user_radio"));
		Log.info("New User Radio button found ");
		return element;
		
	}*/
	
}
