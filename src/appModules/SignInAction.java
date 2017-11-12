package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.LogInPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;

public class SignInAction {
	public static int row = Constant.CurrentRow;
	public static void Execute(WebDriver driver) throws Exception
	{
		//First Click on MyAccount Link
		HomePage.lnk_MyAccount(driver).click();
		
		//Enter Username
		String Username = ExcelUtils.getCellData(row, 0);
		Log.info("Username picked from Excel sheet is "+ Username);
		LogInPage.txtbx_Username(driver).sendKeys(Username);
		
		
		//Enter Password
		String Password = ExcelUtils.getCellData(row, 1);
		Log.info("Password picked from Excel sheet is "+ Password);
		LogInPage.txtbx_Password(driver).sendKeys(Password);
		
		
		//Click SignIn Button
		LogInPage.btn_SignIn(driver).click();
		Log.info("Click Action performed on Sign In Button");
	}
	
	
	public static void NewUser(WebDriver driver) throws Exception
	{
		
				Log.info("Click Action performed on SignIn Lnk");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//Enter emailAddress
				String Username = ExcelUtils.getCellData(row, 0);
				Log.info("Username picked from Excel sheet is "+ Username);
				LogInPage.txtbx_Username(driver).sendKeys(Username);
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
		
				
		//Enter NEw Password
				String Password = ExcelUtils.getCellData(row, 1);
				Log.info("New Password picked from Excel sheet is "+ Password);
				LogInPage.txtbx_NewUserPwd(driver).sendKeys(Password);
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		//Enter again to confirm password 
				String ConPassword = ExcelUtils.getCellData(row, 1);
				Log.info("New Pwd for confirmation picked from Excel sheet is "+ ConPassword);
				LogInPage.txtbx_NewUserConfirmPwd(driver).sendKeys(ConPassword);
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
				
		//Click Sign up Button
				//Click SignIn Button
				LogInPage.lnk_SignUp(driver).click();
				Log.info("Click Action performed on Sign Up Button");
		
	}

}
