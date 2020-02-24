package selEncapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {
	static {
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		LoginPage lp = new LoginPage(driver);
		//lp.setUsername();
		//lp.setlogin();
		
		//lp.setPassword();
		//lp.setlogin();

		lp.setlogin();
		
	}

}
