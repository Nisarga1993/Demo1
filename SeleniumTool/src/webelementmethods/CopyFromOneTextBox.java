package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyFromOneTextBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.opensourcebilling.org");

WebElement un=driver.findElement(By.id("email"));
un.clear();
un.sendKeys("nisha",Keys.CONTROL+"ac");

WebElement pwd=driver.findElement(By.id("password"));
pwd.clear();
pwd.sendKeys(Keys.CONTROL+"v"); 
 
 Thread.sleep(2000);
 
 driver.close();
	}
}
