package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("http://www.google.com");
String url=driver.getCurrentUrl();
System.out.println("The curren URL is:        " +url);
String title=driver.getTitle();
System.out.println("The curren TITLE is:      " +title);
driver.navigate().to("http://www.naukri.com");
Thread.sleep(2000);
driver.quit();
	}

}
