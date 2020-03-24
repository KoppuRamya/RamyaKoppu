package Com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updatepage 
{
	WebDriver driver;

	public void url() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\DEMOBLAZEAPPLICATIONTESTING_844849\\DEMOBLAZEAPPLICATIONTESTING_844849\\src\\test\\resources\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://google.com");
	System.out.println(driver.getTitle());

	}
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
	}
	public void addproducts() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//*[@id=\"nava\"]/img")).click();
		WebElement b=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
		b.click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		Thread.sleep(5000);
		alert.accept();
		driver.findElement(By.xpath("//*[@id=\"nava\"]/img")).click();
		WebElement b2=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
		b2.click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(5000);
		Alert alert2=driver.switchTo().alert();
		String s2=driver.switchTo().alert().getText();
		System.out.println(s2);
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();
		Thread.sleep(5000);
		String s3=driver.findElement(By.id("totalp")).getText();
		System.out.println("Total price  of All addeditems:" +s3);
		Thread.sleep(2000);
		screenshot("C:\\Users\\Ramya\\Desktop\\DEMOBLAZEAPPLICATIONTESTING_844849\\src\\test\\resources\\Screenshots\\screenshot1.png");
		}
		public void screenshot(String path) throws IOException
		{
			TakesScreenshot ts=((TakesScreenshot)driver);
			File Store=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Store,new File(path));
			
		}
}
