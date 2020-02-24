package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentPageSource {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("http://www.google.com");
Thread.sleep(2000);
String cps=driver.getPageSource(); //current page source
System.out.println("The current page source is:" +cps);
driver.close();
	}

}
