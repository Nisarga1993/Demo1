package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
static {
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}

public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.opensourcebilling.org");

WebElement scb=driver.findElement(By.xpath("//label[text()='Keep me signed in']"));
scb.click();

WebElement cb=driver.findElement(By.xpath("//input[@type='checkbox']"));

if(cb.isSelected())
	{
System.out.println("The checkBox is selected");
	}
else
	{
	System.out.println("The checkBox is not selected");			 
}
driver.close();
}
}