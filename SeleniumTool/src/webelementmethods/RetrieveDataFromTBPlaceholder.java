package webelementmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author NISARGA
 *
 */

public class RetrieveDataFromTBPlaceholder {
	static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}

public static void main(String[] args) {
			// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/login.do");
	
WebElement unTB=driver.findElement(By.id("username"));
String data=unTB.getAttribute("placeholder");
System.out.println(data);

driver.close();
}
}
