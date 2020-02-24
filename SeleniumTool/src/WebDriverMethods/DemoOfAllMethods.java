package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOfAllMethods {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.google.com");
String url=driver.getCurrentUrl();
System.out.println("The curren URL is:" +url);
String title=driver.getTitle();
System.out.println("The curren TITLE is:" +title);
String cps=driver.getPageSource();
System.out.println("The current Page Source is:" +cps);
String cwr=driver.getWindowHandle();
System.out.println("The current Window Reference is:" +cwr);
driver.navigate().to("http://www.gmail.com");
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
driver.close();
	}

}
