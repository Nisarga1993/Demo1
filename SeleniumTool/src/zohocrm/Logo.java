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
public class Logo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://192.168.115.128:8080/crm/HomePage.do");

WebElement logo = driver.findElement(By.xpath("//img[@title='Zoho CRM']"));
String title = logo.getTagName();
System.out.println("tagname of LOGO is:   " +title);
driver.close();
	}

}
