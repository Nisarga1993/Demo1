package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime1{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/login.do");

WebElement un=driver.findElement(By.id("username"));
un.sendKeys("admin");
Thread.sleep(1000);

WebElement pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
pwd.sendKeys("manager");
Thread.sleep(1000);

String title=driver.getTitle();
System.out.println(title);

WebElement login=driver.findElement(By.xpath("//div[text()='Login ']"));
login.click();

Thread.sleep(2000);
String titlehp=driver.getTitle();
System.out.println(titlehp);
Thread.sleep(1000);

WebElement usr =driver.findElement(By.xpath("//div[contains(@title,'Warning! Password recovery function is disabled as email settings are not configured.')]"));
Thread.sleep(1000);
usr.click();
String titles=driver.getTitle();
System.out.println(titles);
WebElement lc = driver.findElement(By.xpath("//a[@href='/administration/manage_licenses.do']"));
Thread.sleep(2000);
lc.click();

//driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
}

}
