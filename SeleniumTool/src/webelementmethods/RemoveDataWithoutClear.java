package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveDataWithoutClear {
	static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}

public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.opensourcebilling.org");
	
WebElement a=driver.findElement(By.id("email"));
Thread.sleep(2000);
	
// a.clear();          using clear()
//Thread.sleep(2000);
	 
// a.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
	 
a.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
Thread.sleep(2000);
driver.close();
		
		
}

}
