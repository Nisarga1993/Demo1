package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.naukri.com");
String pwh = driver.getWindowHandle();
System.out.println("parent window reference is:"+pwh);
System.out.println(driver.getTitle());
Set<String> whs = driver.getWindowHandles();
System.out.println(whs);
int count=whs.size();
System.out.println(count);
for(String w:whs)
{
	driver.switchTo().window(w);
	String s=driver.getTitle();
	if(s.contains("Reliance Industries Limited"))
		driver.close();
	}
}

}


