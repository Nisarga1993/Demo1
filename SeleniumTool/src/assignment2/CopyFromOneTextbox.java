package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyFromOneTextbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/login.do");
	WebElement a=driver.findElement(By.id("username"));
	Thread.sleep(2000);
a.sendKeys("admin");
String aa=driver.findElement(By.id("username")).getText();
 Thread.sleep(2000);
 
	WebElement b=driver.findElement(By.name("pwd"));
 b.sendKeys(aa);
 
 Thread.sleep(6000);
 
 driver.close();
	}
}
