package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime1{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://localhost/login.do");

driver.navigate().refresh();
Thread.sleep(1000);

WebElement un=driver.findElement(By.id("username"));
un.sendKeys("admin");

//WebElement pwd=driver.findElement(By.name("pwd"));
//pwd.sendKeys("manager");
//Thread.sleep(1000);

//WebElement login=driver.findElement(By.xpath("//div[text()='Login ']"));
//login.click();

}
}
