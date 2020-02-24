package links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/NISARGA/Desktop/sai/link.html");

//String tn='a';
//By by=By.tagName(tn);
//WebElement linkText = driver.findElement(by);
//linkText.click(); 
	
//WebElement linkText=driver.findElement(By.tagName("a"));
//linkText.click();

driver.findElement(By.tagName("a")).click();
	}

}
