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
public class CreateNewContact1 {
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

driver.findElement(By.xpath("//a[text()='Contacts']")).click();
String campTitle=driver.getTitle();
System.out.println("the Champaign page title is:     " +campTitle);

driver.findElement(By.xpath("//input[@value='New Contact']")).click();
String newcTitle=driver.getTitle();
System.out.println("the new Contact page title is:     " +newcTitle);

//to select Lead FirstName drop down list
WebElement fname=driver.findElement(By.xpath("//select[@name='property(saltName)']"));
//fname.click();
//Thread.sleep(2000);
Select ldropdown = new Select(fname);
ldropdown.selectByIndex(3);

WebElement cfname = driver.findElement(By.xpath("//input[@name='property(First Name)']/../../td[2]/input"));
cfname.sendKeys("Nisarga");
	
driver.findElement(By.xpath("//input[@name='property(Last Name)']")).sendKeys("S");

driver.findElement(By.xpath("//input[@name='property(Email)']")).sendKeys("nisha@gmail.com");

driver.findElement(By.xpath("//input[@name='property(Department)']")).sendKeys("Engineer");

driver.findElement(By.xpath("//input[@name='property(Home Phone)']")).sendKeys("9845350759");

driver.findElement(By.xpath("//input[@name='property(Fax)']")).sendKeys("5555");

driver.findElement(By.xpath("//input[@name='property(Title)']")).sendKeys("engineer");

driver.findElement(By.xpath("//input[@name='property(Phone)']")).sendKeys("9845350759");

driver.findElement(By.xpath("//input[@name='property(Other Phone)']")).sendKeys("9845350759");

driver.findElement(By.xpath("//input[@name='property(Mobile)']")).sendKeys("9845350759");

driver.findElement(By.xpath("//input[@name='property(Assistant)']")).sendKeys("9845350759");


driver.findElement(By.xpath("//input[@name='property(Date of Birth)']")).sendKeys("08/13/1993");

driver.findElement(By.xpath("//input[@name='property(Reports To)']")).sendKeys("Manager");

driver.findElement(By.xpath("//input[@name='property(Mailing Street)']")).sendKeys("chamrajpet");

driver.findElement(By.xpath("//input[@name='property(Mailing City)']")).sendKeys("bangalore");

driver.findElement(By.xpath("//input[@name='property(Mailing State)']")).sendKeys("karnataka");

driver.findElement(By.xpath("//input[@name='property(Mailing Country)']")).sendKeys("India");

driver.findElement(By.xpath("//input[@name='property(Mailing Zip)']")).sendKeys("560018");

//to select copy address drop down list
WebElement mail=driver.findElement(By.xpath("@name='copyAddress'"));
mail.click();
//Thread.sleep(2000);
Select dropdown = new Select(mail);
dropdown.selectByIndex(0);

//to enter contact details in description area
WebElement des=driver.findElement(By.xpath("//textarea[@name='property(Description)']"));
des.sendKeys("First Contact");

//to save details 
//driver.findElement(By.xpath("((//input[@value='Save'])[2])")).submit();

String condet = driver.getTitle();
System.out.println("after creating new contact the page title is:     " +condet);


//driver.findElement(By.xpath("//a[text()='Logout [rashmi@dell.com]']")).click();
//Thread.sleep(2000);
//driver.close();

	}

}
