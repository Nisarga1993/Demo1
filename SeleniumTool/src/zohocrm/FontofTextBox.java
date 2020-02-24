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

public class FontofTextBox{
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
	String c=un.getCssValue("color");
	System.out.println("The Color of UN textbox is:      "+c);
	String fs=un.getCssValue("font-size");
	System.out.println("The font-size of UN textbox is:      "+fs);
	String ff=un.getCssValue("font-family");
	System.out.println("The font-family of UN textbox is:      "+ff);
	
	System.out.println("-----------------------------------------------------------------------------");
	WebElement sign = driver.findElement(By.xpath("//input[@title='Sign In']"));
	String c2=sign.getCssValue("color");
	System.out.println("The Color of sign in button is:      "+c2);
	String fs2=sign.getCssValue("font-size");
	System.out.println("The font-size of sign in button is:      "+fs2);
	String ff2=sign.getCssValue("font-family");
	System.out.println("The font-family of sign in button is:      "+ff2);
	
	
	driver.close();

}
}
