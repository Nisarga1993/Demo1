package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class acti {
	

	static {
		System.setProperty("webdiver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		String lpTitle = driver.getTitle();
		System.out.println(lpTitle);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		//check home page is displayed or not
		String hpTitle = driver.getTitle();
		System.out.println(hpTitle);
		if(lpTitle!=hpTitle)
			System.out.println("Home page is displayed");
			
		//to identify settings
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@title,'Warning! Password recovery function is disabled as email settings are not configured.')]")));
		
		
		/*to identify license
		driver.findElement(By.linkText("/administration/manage_licenses.do")).click();
		Thread.sleep(1000);
		
		//check license page is displayed or not
		String titleL = driver.getTitle();
		System.out.println(titleL+" is displayed");*/
		//Thread.sleep(1000);
		//driver.findElement(By.id("logoutLink"));
		
		//driver.quit();
		
		

	}

}
