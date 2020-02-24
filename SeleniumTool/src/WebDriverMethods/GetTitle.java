package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("http://www.google.com");
Thread.sleep(2000);
String title=driver.getTitle();
System.out.println("The current TITLE is:" +title);
Thread.sleep(2000);
driver.close();
	}

}
