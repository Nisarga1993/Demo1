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
public class XandYco {
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
int x=un.getLocation().getX();
System.out.println("X co ordinate of UN textbox is:  "+x);
int y=un.getLocation().getY();
System.out.println("Y co ordinate of UN textbox is:  "+y);

WebElement pwd = driver.findElement(By.id("passWord"));
int x1=pwd.getLocation().getX();
System.out.println("X co ordinate of PWD textbox is:  "+x1);
int y1=pwd.getLocation().getY();
System.out.println("Y co ordinate of PWD textbox is:  "+y1);
driver.close();

}
}