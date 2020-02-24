package zohocrm;

import java.util.Set;
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
public class CreateNewLead {
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

driver.findElement(By.xpath("//a[text()='Leads']")).click();
//Thread.sleep(2000);
String campTitle=driver.getTitle();
System.out.println("the Lead page title is:     " +campTitle);

driver.findElement(By.xpath("//input[@value='New Lead']")).click();
//Thread.sleep(2000);
String newlTitle=driver.getTitle();
System.out.println("the new Lead page title is:     " +newlTitle);
		
//to select Lead FirstName drop down list
WebElement lfname=driver.findElement(By.xpath("//select[@name='property(saltName)']"));
//lfname.click();
//Thread.sleep(2000);
Select ldropdown = new Select(lfname);
ldropdown.selectByIndex(3);

WebElement fname = driver.findElement(By.xpath("//input[@name='property(First Name)']/../../td[2]/input"));
fname.sendKeys("Nisarga");
	
driver.findElement(By.xpath("//input[@name='property(Last Name)']")).sendKeys("S");

driver.findElement(By.xpath("//input[@name='property(Company)']")).sendKeys("ABC");

driver.findElement(By.xpath("//input[@name='property(Designation)']")).sendKeys("Engineer");

driver.findElement(By.xpath("//input[@name='property(Email)']")).sendKeys("nisha@123.gmail.com");

driver.findElement(By.xpath("//input[@name='property(Phone)']")).sendKeys("9538108118");

driver.findElement(By.xpath("//input[@name='property(Mobile)']")).sendKeys("9538108118");

driver.findElement(By.xpath("//input[@name='property(Fax)']")).sendKeys("5555");

driver.findElement(By.xpath("//input[@name='property(Website)']")).sendKeys("www.abc.com");

//to select Lead source drop down list
WebElement leads=driver.findElement(By.xpath("//select[@name='property(Lead Source)']"));
Select tdropdown1 = new Select(leads);
tdropdown1.selectByValue("Advertisement");

//to select Lead Status drop down list
WebElement lstatus=driver.findElement(By.xpath("//select[@name='property(Lead Status)']"));
Select tdropdown2 = new Select(lstatus);
tdropdown2.selectByValue("Contacted");

//to select Industry drop down list
WebElement ind=driver.findElement(By.xpath("//select[@name='property(Industry)']"));
Select tdropdown3 = new Select(ind);
tdropdown3.selectByValue("Data/Telecom OEM");

//to select Rating drop down list
WebElement rat=driver.findElement(By.xpath("//select[@name='property(Rating)']"));
Select tdropdown4 = new Select(rat);
tdropdown4.selectByValue("Active");

driver.findElement(By.xpath("//input[@name='property(campName:Campaign Source)']/../../td[2]/img")).click();
Set<String> whs = driver.getWindowHandles();
int s = whs.size();
System.out.println(s);

for(String w:whs)
{
	driver.switchTo().window(w);
	String s1 = driver.getTitle();
	if(s1.contains("Zoho CRM - Campaign Name Lookup"))
	{
		driver.findElement(By.xpath("//a[contains(@onclick,'setValue')]")).click();
		driver.navigate().back();
		
	}
}


driver.findElement(By.xpath("//input[@name='property(No of Employees)']")).sendKeys("2500");

driver.findElement(By.xpath("//input[@name='property(Annual Revenue)']")).sendKeys("40000");

driver.findElement(By.xpath("//input[@name='property(Street)']")).sendKeys("chamrajpet");


driver.findElement(By.xpath("//input[@name='property(City)']")).sendKeys("bangalore");

driver.findElement(By.xpath("//input[@name='property(State)']")).sendKeys("karnataka");

driver.findElement(By.xpath("//input[@name='property(Country)']")).sendKeys("India");

driver.findElement(By.xpath("//input[@name='property(Zip Code)']")).sendKeys("560018");

//to enter details in description area
WebElement des=driver.findElement(By.xpath("//textarea[@name='property(Description)']"));
des.sendKeys("First Lead");

//to save details 
//driver.findElement(By.xpath("((//input[@value='Save'])[2])")).submit();

String leaddet = driver.getTitle();
System.out.println("after creating new lead the page title is:     " +leaddet);


//driver.findElement(By.xpath("//a[text()='Logout [rashmi@dell.com]']")).click();
//Thread.sleep(2000);
//driver.close();
	}

}
