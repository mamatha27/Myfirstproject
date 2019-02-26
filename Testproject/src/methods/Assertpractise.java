package way2automation;


	
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Assertpractise {
	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    //String driverPath = "C:\\QualityAssurance\\Installs\\Drivers\\geckodriver.exe";
	    public WebDriver driver ; 
	     
	  @Test
	  public void verifyHomepageTitle() {
	       
	      System.out.println("launching firefox browser"); 
	     // System.setProperty("webdriver.firefox.marionette", driverPath);
	      WebDriverManager.firefoxdriver().setup();
	      driver = new FirefoxDriver();
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
	  }
	}

