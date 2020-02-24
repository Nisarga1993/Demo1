package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentWindowReference {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("http://www.google.com");
Thread.sleep(2000);
String cwr=driver.getWindowHandle();
System.out.println("The Current Window Reference is:" +cwr);
Thread.sleep(2000);
driver.close();

	}

}
