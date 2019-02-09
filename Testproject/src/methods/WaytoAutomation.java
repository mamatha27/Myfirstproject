package methods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class WaytoAutomation {

	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//String strPath = System.getProperty("user.dir");//
		System.setProperty("webdriver.gecko.driver", "C:\\QualityAssurance\\Installs\\Drivers\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("http://www.way2automation.com/");

		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicit wait
		//WebElement RESOURCES = driver.findElement(By.linkText("RESOURCES"));
		Actions menu = new Actions(driver);
		/*menu.moveToElement(lnkLoginSignup).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Travel Agent Login")).click();
		Thread.sleep(1000);*/

		menu.moveToElement(driver.findElement(By.linkText("RESOURCES"))).perform();
		//Thread.sleep(2000);
		menu.moveToElement(driver.findElement(By.linkText("Practice site 1"))).perform();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Practice site 1")).click();
		Thread.sleep(2000);
		Set <String> winhandle = driver.getWindowHandles();
		System.out.println(winhandle.size());

//WebElement sign=driver.findElement(By.xpath("//p[@class='text_popup']/a[contains(text(),'Signin')]"));

	/*	WebElement sigin = driver.findElement(By.xpath("//a[contains(text(), 'Signin']"));
		sigin.click();
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("mamatha2227");
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("iloveindia2");
		driver.findElement(By.xpath("//input[@class = 'button']")).click();

*/

		WebElement sign=driver.findElement(By.xpath("//p[@class='text_popup']/a[contains(text(),'Signin')]"));
		sign.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='login']/form/fieldset[1]/input")).sendKeys("mamatha2227");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='login']/form/fieldset[2]/input")).sendKeys("iloveindia2");
		driver.findElement(By.xpath("//div[@id='login']/form/div/div[2]/input")).click();


	}

}
