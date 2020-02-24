package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.amazon.com");
		
		//WebElement search=driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone",Keys.ENTER);
		Thread.sleep(1000);
		
    WebElement click= driver.findElement(By.xpath("//span[text()='Shop now']"));
	click.click();
	
		//driver.close();
	}
}