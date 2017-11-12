package appModules;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import PageObjects.*;

import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;

public class MyAccount {
	public static int row = Constant.CurrentRow;
	
	public static void PersonalDetails(WebDriver driver)
	{
		HomePage.lnk_MyAccount(driver).click();
		Log.info("My Account Link On Home page is Clicked");
		WebElement element1 = MyAccountPage.navLnk_MyAccount(driver);
		WebElement element2 = MyAccountPage.navLnk_PersonalDetails(driver);
		Actions action = new Actions(driver);
		action.moveToElement(element1).moveToElement(element2).click().build().perform();
		 

	}
	
	public static void EditPersonalDetails(WebDriver driver) throws Exception
	{
		PersonalDetails(driver);
		
		WebElement element1 = PersonalDetailsPage.lst_Title(driver);
		Select oSelect1 = new Select(element1);
		String Title = ExcelUtils.getCellData(row, 2);
		 oSelect1.selectByVisibleText(Title);
		 Log.info("Title is selected");
		 
		 WebElement element2 = PersonalDetailsPage.txtbx_FirstName(driver);
		 String firstName = ExcelUtils.getCellData(row, 3);
		 element2.clear();
		 element2.sendKeys(firstName);
		 Log.info("First Name is set");
		 
		 WebElement element3 = PersonalDetailsPage.txtbx_LastName(driver);
		 String lastName = ExcelUtils.getCellData(row, 4);
		 element3.clear();
		 element3.sendKeys(lastName);
		 Log.info("Last Name is set");
		 
		 WebElement element4 = PersonalDetailsPage.lst_Gender(driver);
			Select oSelect2 = new Select(element4);
			String Gender = ExcelUtils.getCellData(row, 5);
			Log.info("Gender picked from excel sheet is "+Gender);
			 oSelect2.selectByVisibleText(Gender);
			 Log.info("Gender is selected");
			 
			 WebElement element5 = PersonalDetailsPage.lst_AnniversaryDay(driver);
				Select oSelect3 = new Select(element5);
				
				String annDay = ExcelUtils.getCellData(row, 6);
				System.out.println("Hello ! MY Value is"+annDay);
				Log.info("Anniversary day picked from excel sheet is " +annDay );
				oSelect3.selectByVisibleText(annDay);
				Log.info("AnniversaryDay dropdown is selected");
		 
				 WebElement element6 = PersonalDetailsPage.lst_AnniversaryMonth(driver);
					Select oSelect4 = new Select(element6);
					String annMonth = ExcelUtils.getCellData(row, 7);
					 oSelect4.selectByVisibleText(annMonth);
					 Log.info("AnniversaryMonth dropdown is selected");
		
					 WebElement element7 = PersonalDetailsPage.lst_AnniversaryYear(driver);
						Select oSelect5 = new Select(element7);
						String annYear = ExcelUtils.getCellData(row, 8);
						oSelect5.selectByVisibleText(annYear);
						 Log.info("AnniversaryYear dropdown is selected");
						 
						 WebElement element8 = PersonalDetailsPage.lst_DobDay(driver);
							Select oSelect6 = new Select(element8);
							String dobDay = ExcelUtils.getCellData(row, 9);
							oSelect6.selectByVisibleText(dobDay);
							 Log.info("DOB Day dropdown is selected");
							 
							 WebElement element9 = PersonalDetailsPage.lst_DobMonth(driver);
								Select oSelect7 = new Select(element9);
								String dobMonth = ExcelUtils.getCellData(row, 10);
								oSelect7.selectByVisibleText(dobMonth);
								 Log.info("DOB Month dropdown is selected");
							 
						 WebElement element10 = PersonalDetailsPage.lst_DobYear(driver);
						 Select oSelect8 = new Select(element10);
						 String dobYear = ExcelUtils.getCellData(row, 11);
						 oSelect8.selectByVisibleText(dobYear);
						 Log.info("DOB Year dropdown is selected");		 
						 
						 WebElement element11 = PersonalDetailsPage.lst_AnnualIncome(driver);
						 Select oSelect9 = new Select(element11);
						 String annualIncome = ExcelUtils.getCellData(row, 12);
						 Log.info("Annual Income picked from excel sheet is " +annualIncome );
						 int data = Integer.parseInt(annualIncome);
						 oSelect9.selectByIndex(data);
						 Log.info("Annual Income dropdown is selected");
						 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						 
						 WebElement element12 = PersonalDetailsPage.btn_SaveInfo(driver);
						 if (element12 != null)
						 {
						 element12.click();
						 Log.info("Save Button found and clicked");
						 }
						 else
						 {
							 Log.info("Save Button not found"); 
						 }
						 
	}
	
	

}
