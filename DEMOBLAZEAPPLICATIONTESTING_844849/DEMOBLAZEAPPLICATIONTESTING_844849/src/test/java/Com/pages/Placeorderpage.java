package Com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Placeorderpage 
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
	public void placeorder() throws InterruptedException
	{
		WebElement b=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
		b.click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		Thread.sleep(5000);
		alert.accept();
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		   driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ramya");
		   driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
		   driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Chennai");
		   driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("123456");
		   driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("12");
		   driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("22");
		   driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		
	}
	

}
