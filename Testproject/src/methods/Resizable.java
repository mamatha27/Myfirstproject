package jqueryelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {
	WebDriver driver;
	@Test
	public void jquery_resizable() throws InterruptedException{
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions action = new Actions(driver);
		Thread.sleep(5000);

		//action.dragAndDropBy(resize,600,200).build().perform();
		action.clickAndHold(resize).dragAndDropBy(resize, 200, 100).perform();
		
		
	}
	@BeforeTest
	public void beforetest(){
		WebDriverManager.chromedriver().setup();
		
	driver = new ChromeDriver();
		
	}
	@AfterTest
	public void aftertest(){
		driver.quit();
	}

}
