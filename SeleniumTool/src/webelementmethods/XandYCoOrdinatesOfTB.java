package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XandYCoOrdinatesOfTB {
static {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}

public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.opensourcebilling.org");

WebElement un=driver.findElement(By.id("email"));
int unx = un.getLocation().getX();
System.out.println("X co-ordinate of UN textbox is:    " +unx  );

int uny = un.getLocation().getY();
System.out.println("Y co-ordinate of UN textbox is:    " +uny );
	
System.out.println("------------------------------------------");

WebElement pwd=driver.findElement(By.id("password"));
int px = pwd.getSize().getWidth();
System.out.println("X co-ordinate of PWD textbox is:    " +px  );
	
int py= pwd.getSize().getHeight();
System.out.println("Y co-ordinate of PWD textbox is:    " +py );
Thread.sleep(2000);
	
driver.close();
}
}
