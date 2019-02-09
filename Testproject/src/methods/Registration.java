package way2automation;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
	WebDriver driver;
    @Test
	public void Login() throws InterruptedException{
		String URL = "http://way2automation.com/way2auto_jquery/tooltip.php";
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
	    driver.get("http://www.way2automation.com/demo.html");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(5000);*/
		WebDriverWait wait = new WebDriverWait(driver,50);
		WebElement sign=driver.findElement(By.xpath("//p[@class='text_popup']/a[contains(text(),'Signin')]"));
		wait.until(ExpectedConditions.elementToBeClickable(sign));
		sign.click();
		
		WebElement username=driver.findElement(By.xpath("//div[@id='login']/form/fieldset[1]/input"));
		Thread.sleep(5000);

		username.sendKeys("divyabharathi");
		
		driver.findElement(By.xpath("//div[@id='login']/form/fieldset[2]/input")).sendKeys("divyabharathi@16");
		driver.findElement(By.xpath("//div[@id='login']/form/div/div[2]/input")).click();
		//WebElement dragbox=driver.findElement(By.xpath("//a[@href='draggable.php']"));
	    Thread.sleep(5000);
	   // WebElement listboxes=driver.findElement(By.xpath("//ul[@class='boxed_style block']"));
	    
	    List<WebElement> boxes= driver.findElements(By.tagName("a"));//("//ul[@class='boxed_style block']/li[1]"));
	    System.out.println(boxes.size());
	    
    }
    
    @BeforeTest
	public void beforetest(){
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
		}
    @AfterTest
    public void aftertest(){
    	//driver.quit();
    	
    }

}
