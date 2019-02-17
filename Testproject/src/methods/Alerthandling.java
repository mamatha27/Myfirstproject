package selenium.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerthandling {
	WebDriver driver;
	
	@Test
	public void Alerthandling() throws InterruptedException{
		driver.navigate().to("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		//driver.findElement(By.cssSelector("#signin_info > a:nth-child(1)")).click();
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(3000);
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		
	}
    @BeforeTest
	public void beforetest(){
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
		
	}
    @AfterTest
    public void aftertest(){
    	driver.quit();
    	
    }
}
