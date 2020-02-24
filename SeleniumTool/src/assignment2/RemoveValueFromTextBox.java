package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveValueFromTextBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("C:/Users/NISARGA/Desktop/sai/absolutepath1.html");

WebElement a=driver.findElement(By.xpath("//div[1]/input[1]"));
a.clear();

Thread.sleep(2000);

driver.close();
	} 

}
