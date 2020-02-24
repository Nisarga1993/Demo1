package zohocrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author NISARGA
 *
 */
public class CreateNewTask {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://192.168.115.128:8080/crm/HomePage.do");

String loginTitle=driver.getTitle();
WebDriverWait wait=new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.titleContains("Zoho CRM - Sign in"));
System.out.println("title of login page is:   " +loginTitle);

driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
Thread.sleep(2000);
driver.findElement(By.id("passWord")).sendKeys("123456");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@title='Sign In']")).click();
Thread.sleep(2000);

String hpTitle=driver.getTitle();
System.out.println("the home page title is:     " +hpTitle);

driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
Thread.sleep(2000);
String campTitle=driver.getTitle();
System.out.println("the Champaign page title is:     " +campTitle);

driver.findElement(By.xpath("//a[text()='nisha']")).click();
Thread.sleep(2000);
String se=driver.getTitle();
System.out.println("after selecting a campaign page title is:     " +se);

driver.findElement(By.xpath("//input[@value='New Task']")).click();
Thread.sleep(2000);

driver.findElement(By.id("subject")).sendKeys("banners");
Thread.sleep(2000);

WebElement taskdes = driver.findElement(By.xpath("//textarea[@name='property(comments)']"));
		taskdes.sendKeys("first task");
		Thread.sleep(2000);
		
driver.findElement(By.id("duedate")).sendKeys("11/14/2019");
Thread.sleep(2000);

//to select status dropdown list
WebElement status=driver.findElement(By.xpath("//select[@name='property(status)']"));
Thread.sleep(2000);
Select dropdown = new Select(status);
dropdown.selectByValue("Not Started");

//to select priority dropdown list
WebElement pri=driver.findElement(By.xpath("//select[@name='property(priority)']"));
Select sdropdown = new Select(pri);
sdropdown.selectByValue("High");

driver.findElement(By.xpath("//input[@value='Save']")).submit();
Thread.sleep(2000);

String taskdet = driver.getTitle();
System.out.println("after creating new campaign the page title is:     " +taskdet);


//driver.findElement(By.xpath("//a[text()='Logout [rashmi@dell.com]']")).click();
//Thread.sleep(2000);
//driver.close();
	}
}
 