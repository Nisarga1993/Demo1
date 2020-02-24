package assignment2;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XandYCoOrdinates {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("http://localhost/login.do");

WebElement c=driver.findElement(By.id("username"));

Point point=c.getLocation();

int x=point.getX();
Thread.sleep(2000);
System.out.println("X co-ordinate value is:   " +x);

int y=point.getY();
Thread.sleep(1000);
System.out.println("Y co-ordinate value is:    " +y);

driver.close();



	}

}
