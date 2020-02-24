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

public class FontOfTextBox {
	static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}

public static void main(String[] args) {
			// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/login.do");
	
WebElement unTb=driver.findElement(By.id("username"));
String fontsize=unTb.getCssValue("font-size");
System.out.println(fontsize);
System.out.println("--------------------------------");

String fontcolor=unTb.getCssValue("color");
System.out.println(fontcolor);
System.out.println("--------------------------------");

String fontfamily=unTb.getCssValue("font-family");
System.out.println(fontfamily);
System.out.println("--------------------------------");

driver.close();
}
}

