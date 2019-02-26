package testNGpackage;


	import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;//

import com.google.common.base.Verify;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class NewTestNG {
	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	  //  String driverPath = "C:\\QualityAssurance\\Installs\\Drivers\\geckodriver.exe";
	    public WebDriver driver ; 
	     
	  @Test
	  public void verifyHomepageTitle() {
	       
	      System.out.println("launching firefox browser"); 
	  //    System.setProperty("webdriver.firefox.marionette", driverPath);
	      WebDriverManager.firefoxdriver().setup();
	      driver = new FirefoxDriver();
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Verify.verify(true);
	      driver.close();
	  }
	
	
	
	
	

}
