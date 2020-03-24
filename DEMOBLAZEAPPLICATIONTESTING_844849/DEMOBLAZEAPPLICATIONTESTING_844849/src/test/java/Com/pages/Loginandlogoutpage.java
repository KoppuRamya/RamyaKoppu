package Com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginandlogoutpage 
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
		public void userclick()
		{
			driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		}
		public void usernamepassword(String username,String password) 
		{
			driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(username);
			driver.findElement(By.id("loginpassword")).sendKeys(password);
			WebElement d=driver.findElement(By.xpath("//*[@id=\"logInModal\"]//div//div//div[3]//button[2]"));
			d.click();
		}
		public void logout() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"logout2\"]")).click();
		}
}
