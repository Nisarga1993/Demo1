package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.flipkart.com");
		
		//to close hidden division popup
		driver.findElement(By.xpath("//button[text()='✕']")).sendKeys(Keys.ENTER);
		//Thread.sleep(1000);
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("iphone xr",Keys.ENTER);
		Thread.sleep(1000);
		
		String ap=driver.findElement(By.xpath("//div[text()='Apple iPhone XR (Black, 64 GB)']/../../../div[2]/div[2]/div[1]/div/div[2]")).getText();
	System.out.println(ap);
	driver.close();
	}
}
//save as uft-8