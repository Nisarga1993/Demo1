package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/login.do");

WebElement un=driver.findElement(By.xpath("//input[@name='username']"));
un.sendKeys("admin");
Thread.sleep(1000);

WebElement pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
pwd.sendKeys("manager");
Thread.sleep(1000);

String title=driver.getTitle();
System.out.println(title);

WebElement login=driver.findElement(By.xpath("//div[.='Login ']"));
login.click();

Thread.sleep(2000);
String titlehp=driver.getTitle();
System.out.println(titlehp);
Thread.sleep(1000);

//WebElement usertab=driver.findElement(By.xpath("//div[contains(text(),'USERS')]"));
//usertab.click();
//Thread.sleep(1000);
//String titleUser=driver.getTitle();
//System.out.println(titleUser);

WebElement usr =driver.findElement(By.xpath("//div[contains(text(),'USERS']"));
usr.click();

WebElement aus =driver.findElement(By.xpath("//div[contains(@class,'addUserButton')]"));
aus.click();

WebElement fn =driver.findElement(By.xpath("//div[contains(@id,'userDataLightBox_firstNameField')]"));
fn.sendKeys("nisha");

WebElement ln =driver.findElement(By.xpath("//div[contains(@id,'userDataLightBox_lastNameField')]"));
ln.sendKeys("S");

WebElement mail =driver.findElement(By.xpath("//div[contains(@id,'userDataLightBox_emailField')]"));
mail.sendKeys("nisargasrinivas@gmail.com");

driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}

}
