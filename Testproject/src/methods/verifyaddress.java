package ckwebsite;



	import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;


import io.github.bonigarcia.wdm.WebDriverManager;
	import urls.Guruurl;

	public class verifyaddress {
		
		public static WebDriver driver;
		
		@Test
		public void Login_section() throws IOException, InterruptedException, AWTException{
			
			driver.get("https://www.calvinklein.co.uk/women");
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\selenium\\batchjava\\capturescreen.jpg"));
			driver.manage().window().maximize();
			
		
			driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
			/*WebElement frame=driver.findElement(By.xpath("//iframe[@src='https://a8382950752.cdn.optimizely.com/client_storage/a8382950752.html']"));
			driver.switchTo().frame(frame);
			*/
			Thread.sleep(6000);
			driver.findElement(By.xpath("//div[@class='cookie-notice']/div/button[2]")).click();
			Thread.sleep(4000);
			//driver.findElement(By.xpath("//button[@class='ReactModal__Close']")).click();
			WebElement my_account=driver.findElement(By.xpath("//button[@class='header-account__sign-in']"));
			Actions mouse_over=new Actions(driver);
			mouse_over.moveToElement(my_account).perform();
			
			driver.findElement(By.xpath("//button[@class='button--full-width button']")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@name='logonId']")).sendKeys("divyabharathi.ptb@gmail.com");
			driver.findElement(By.xpath("//input[@name='logonPassword']")).sendKeys("Sudee@16");
			Thread.sleep(3000);
			Robot escape= new Robot();
			escape.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(3000);
			/*WebElement iframe_1=driver.findElement(By.xpath("//iframe[@src='https://a8382950752.cdn.optimizely.com/client_storage/a8382950752.html']"));
			driver.switchTo().frame(iframe_1);*/
			driver.findElement(By.xpath("//div[@class='ReactModal__Overlay ReactModal__Overlay--after-open']/div/div/form/button")).click();
			Thread.sleep(3000);
			WebElement my_account1=driver.findElement(By.xpath("//div[@class='header-account__inner']/span"));
			Actions mouse_over1=new Actions(driver);
			mouse_over1.moveToElement(my_account1).perform();
			driver.findElement(By.linkText("Address Book")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'Add new address')]")).click();
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@for='WC_AccountForm_sbAddress_3Remodal']")).click();
			WebElement gender=driver.findElement(By.xpath("//*[@id='WC__AddressForm_FormInput_personTitleRemodal_chosen']/a"));
			gender.click();
			Thread.sleep(5000);
			WebElement gender_ms= driver.findElement(By.xpath("//*[@id='WC__AddressForm_FormInput_personTitleRemodal_chosen']/div/ul/li[3]"));
			Actions mouse_gender=new Actions(driver);
			mouse_gender.moveToElement(gender_ms).click().perform();
			// gender_ms= new Select(gender);
			//move_gender.moveToElement(gender_ms).click();
			driver.findElement(By.xpath("//input[@id='firstNameRemodal']")).sendKeys("divya");
			driver.findElement(By.xpath("//input[@id='lastNameRemodal']")).sendKeys("peri");
			driver.findElement(By.xpath("//input[@id='address1Remodal']")).sendKeys("gantshill");
			driver.findElement(By.xpath("//input[@id='address2Remodal']")).sendKeys("whitefield");
            Robot page_down = new Robot();
            page_down.keyPress(KeyEvent.VK_PAGE_DOWN);
			driver.findElement(By.xpath("//input[@id='cityRemodal']")).sendKeys("illford");
			driver.findElement(By.xpath("//input[@id='zipCodeRemodal']")).sendKeys("IG26FA");
		
			WebElement country= driver.findElement(By.xpath("//select[@id='countrySelectorRemodal']"));
            Select country_list = new Select(country);
            country_list.selectByVisibleText("United Kingdom");
            driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id='address1']")).clear();
            driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("startford");
            Robot pagedown = new Robot();
            pagedown.keyPress(KeyEvent.VK_PAGE_DOWN);
            Thread.sleep(3000);
            
            System.out.println(driver.findElement(By.xpath("//*[@id='AddressForm']/div/div[2]/div[2]/button")).getText());
            WebElement update_address=driver.findElement(By.xpath("//*[@id='AddressForm']/div/div[2]/div[2]/button"));
            
            update_address.click();
            update_address.click();

            Thread.sleep(3000);

		

	}

			
			
		
		@BeforeTest
		public void beforetest(){
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		@AfterTest
		public void aftertest(){
			//driver.quit();
			
		}
		
		
		
		

	}



