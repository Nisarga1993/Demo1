package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightandWidth {
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://localhost/login.do");
	
	WebElement a=driver.findElement(By.id("username"));
	
	double height=a.getSize().getHeight();
	System.out.println("Height is:  " +height);
	
	double width=a.getSize().getWidth();
	System.out.println("Width is:  "+width);
	
	driver.close();
	

	}

}
