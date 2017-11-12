package automationframework;

import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.IExtentTestClass;
import com.relevantcodes.extentreports.LogStatus;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import PageObjects.HomePage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;
import appModules.MyAccount;
import appModules.SignInAction;




public class Demotest {
	WebDriver driver;
	
	 @BeforeMethod
	  public void beforeMethod() throws Exception {
		    //DOMConfigurator.configure("log4j.xml");
			//Log.startTestCase("First Test Case");
			//ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
			//Log.info("Excel Sheet Opened");
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("chrome.switches","--disable-extensions");
			//String exePath = "C:\\Users\\Ariz\\Documents\\chromedriver.exe";
			String exePath = "C:\\Users\\Ariz\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", exePath);
			//driver = new ChromeDriver(options);
			System.out.print("Welcome to Selenium nworlddkjhdkjh");
			
			
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
		    driver = new FirefoxDriver(capabilities);
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Log.info("New driver instantiated");
			driver.get("https://www.homeshop18.com/");
			
	  }
	 @Test
	public void EditPersonalDetails() throws Exception 
  {
  	//WebDriver driver = TestNG_Framework.beforeMethod();
  	// Sign In with Existing USer's valid Credentials. 

		
	  System.out.print("Edit");
      SignInAction.Execute(driver);
      System.out.println("Login Successfully, now it is the time to Log Off buddy.");
      HomePage.lnk_Logout(driver).click();
      //Log.info("Click Action is performed on Log out link.");
      
      
   }
	 
	 
 @AfterMethod
  public void afterMethod() {
  
	//Log.endTestCase("First Test Case");
	driver.quit();
  }

}
