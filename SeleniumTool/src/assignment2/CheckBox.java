package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("http://localhost/login.do");

WebElement c =driver.findElement(By.id("keepLoggedInCheckBox"));

//before selecting
System.out.println("The Checkbox is:  "  +c.isSelected());

c.click();
Thread.sleep(2000);

System.out.println("The checkbox state is:  " +c.isSelected());

driver.close();

	}

}
