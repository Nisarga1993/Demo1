package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("http://www.google.com");
Thread.sleep(2000);
driver.navigate().to("http://www.gmail.com");
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.close();
	}

}
