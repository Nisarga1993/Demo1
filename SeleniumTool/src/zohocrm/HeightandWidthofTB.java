package zohocrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author NISARGA
 *
 */

public class HeightandWidthofTB{
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://192.168.115.128:8080/crm/HomePage.do");

	WebElement un = driver.findElement(By.id("userName"));
	int h=un.getSize().getHeight();
	System.out.println("The Height of UN textbox is:      "+h);
	int w=un.getSize().getWidth();
	System.out.println("The Width of UN textbox is:      "+w);
	
	WebElement pwd = driver.findElement(By.id("passWord"));
	int h1=pwd.getSize().getHeight();
	System.out.println("The Height of PWD textbox is:      "+h1);
	int w1=pwd.getSize().getWidth();
	System.out.println("The Width of PWD textbox is:      "+w1);
	driver.close();
	
  }
}
