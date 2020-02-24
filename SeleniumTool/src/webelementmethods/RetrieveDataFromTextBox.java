package webelementmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveDataFromTextBox {
	static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}

public static void main(String[] args) {
			// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.opensourcebilling.org");
	
WebElement unTB=driver.findElement(By.id("email"));
String data=unTB.getAttribute("value");
System.out.println(data);
unTB.clear();
System.out.println("----------------------------");

unTB.sendKeys("Nisha");
String data1=unTB.getAttribute("value");
System.out.println(data1);
System.out.println("--------------------------------");

String idValue=unTB.getAttribute("id");
System.out.println(idValue);
}
}
