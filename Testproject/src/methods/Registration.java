package way2automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	public void Login() throws InterruptedException, AWTException{
		String URL = "http://way2automation.com/way2auto_jquery/tooltip.php";
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		//driver.get("http://www.way2automation.com/demo.html");

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
		Thread.sleep(3000);

		username.sendKeys("divyabharathi");

		driver.findElement(By.xpath("//div[@id='login']/form/fieldset[2]/input")).sendKeys("divyabharathi@16");
		driver.findElement(By.xpath("//div[@id='login']/form/div/div[2]/input")).click();
		Thread.sleep(2000);
		//-----------------Assignment 3: Count total number of boxes under WIDGET section--------;
		/*WebElement listboxes=driver.findElement(By.xpath("//h1[text()='Widget']/following::ul"));////ul[@class='boxed_style block *[@class='linkbox margin-bottom-20']

		List<WebElement> boxes= listboxes.findElements(By.tagName("a"));//("//ul[@class='boxed_style block']/li[1]"));
		System.out.println(boxes.size());*/
        //-------------------------Assignment 2: Count total number of boxes from below page---------
		WebElement listboxes=driver.findElement(By.xpath("//div[@class='row']"));////ul[@class='boxed_style block *[@class='linkbox margin-bottom-20']

		List<WebElement> boxes= listboxes.findElements(By.tagName("a"));//("//ul[@class='boxed_style block']/li[1]"));
		System.out.println(boxes.size());
		for(int i=0;i<boxes.size();i=i+1){
			System.out.println(boxes.get(i).getText());
		}
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(3000);
		//------------------Assignment 4: Click on the box with name DROPDOWN-----------------
		driver.findElement(By.xpath("//h1[text()='Dynamic Elements']/following::ul/li[2]/a")).click();
		Thread.sleep(2000);
		Robot robot =  new Robot();
	
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);

        
		

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
