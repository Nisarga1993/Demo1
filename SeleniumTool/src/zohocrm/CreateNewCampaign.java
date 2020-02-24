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
public class CreateNewCampaign {
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
driver.findElement(By.id("passWord")).sendKeys("123456");
driver.findElement(By.xpath("//input[@title='Sign In']")).click();

String hpTitle=driver.getTitle();
System.out.println("the home page title is:     " +hpTitle);

driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
String campTitle=driver.getTitle();
System.out.println("the Champaign page title is:     " +campTitle);

driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
String newcTitle=driver.getTitle();
System.out.println("the new Champaign page title is:     " +newcTitle);

WebElement campname=driver.findElement(By.xpath("//input[@name='property(Campaign Name)']"));
		campname.sendKeys("nisha");
		
driver.findElement(By.xpath("//input[@name='property(Start Date)']")).sendKeys("11/09/2019");

driver.findElement(By.xpath("//input[@name='property(End Date)']")).sendKeys("11/15/2019");

driver.findElement(By.xpath("//input[@name='property(Actual Cost)']")).sendKeys("50000");

driver.findElement(By.xpath("//input[@name='property(Budgeted Cost)']")).sendKeys("30000");

driver.findElement(By.xpath("//input[@name='property(Expected Revenue)']")).sendKeys("60000");

driver.findElement(By.xpath("//input[@name='property(Expected Response)']")).sendKeys("1000");

driver.findElement(By.xpath("//input[@name='property(Num sent)']")).sendKeys("50");

//to select type dropdown list
WebElement type=driver.findElement(By.xpath("//select[@name='property(Type)']"));
Select tdropdown = new Select(type);
tdropdown.selectByValue("Advertisement");

//to select status dropdown list
WebElement status=driver.findElement(By.xpath("//select[@name='property(Status)']"));
Select sdropdown = new Select(status);
sdropdown.selectByValue("Planning");

//to enter details in description area
WebElement des=driver.findElement(By.xpath("//textarea[@name='property(Description)']"));
des.sendKeys("First Campaign");

driver.findElement(By.xpath("((//input[@value='Save'])[2])")).submit();

String camdet = driver.getTitle();
System.out.println("after creating new campaign the page title is:     " +camdet);


//driver.findElement(By.xpath("//a[text()='Logout [rashmi@dell.com]']")).click();
//Thread.sleep(2000);
//driver.close();
	}

}
