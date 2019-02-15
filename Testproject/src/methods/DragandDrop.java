package way2automation;

import javax.print.Doc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.xml.internal.txw2.Document;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	WebDriver driver;
	@Test
	public void Drag() throws InterruptedException{
		driver.get("http://way2automation.com/way2auto_jquery/draggable.php");
		driver.findElement(By.xpath("//div[@class='bottom row']/div[@class='span_3_of_4']/p[@class='text_popup']/a[@href='#login']")).click();
		driver.findElement(By.xpath("//form[@id='load_form']/fieldset[1]/input[@name='username']")).sendKeys("divyabharathi");
		driver.findElement(By.xpath("//form[@id='load_form']/fieldset[2]/input[@name='password']")).sendKeys("divyabharathi@16");
		driver.findElement(By.xpath("//div[@id='login']/form/div[@class='bottom row']/div[@class='span_1_of_4']/input[@value='Submit']")).click();
		Thread.sleep(5000);
		WebDriverWait wait= new WebDriverWait(driver,200L);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='container margin-top-20']/div[@class='row']/div[1]/ul/li[1]/a")));

		driver.findElement(By.xpath("//div[@class='container margin-top-20']/div[@class='row']/div[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		//-------------------------iframes-----------------
		/*WebDriverWait wait1= new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("freme_box")));
		 */
		/*WebElement srcdraggable=driver.findElement(By.xpath("//div[@id='draggable']"));
		driver.switchTo().frame(0);

		Actions dragable= new Actions(driver);
		dragable.dragAndDropBy(srcdraggable, 6, 5);
		 */
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);

		Thread.sleep(5000);
		//WebElement frame= driver.findElement(By.xpath("//div[@id='example-1-tab-1']/div[@class='freme_box']"));
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		System.out.println("switched to frane0");
		WebElement srcdraggable=driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions dragable= new Actions(driver);
		//dragable.dragAndDropBy(srcdraggable, 150, 780).perform();tried not working 
		dragable.clickAndHold(srcdraggable).moveByOffset(150,100).release().build().perform();

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
