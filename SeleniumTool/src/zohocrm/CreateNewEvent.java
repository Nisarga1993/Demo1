package zohocrm;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	/**
	 * 
	 * @author NISARGA
	 *
	 */
	public class CreateNewEvent {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://192.168.115.128:8080/crm/HomePage.do");

	String loginTitle=driver.getTitle();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleContains("Zoho CRM - Sign in"));
	System.out.println("title of login page is:   " +loginTitle);

	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	Thread.sleep(2000);
	driver.findElement(By.id("passWord")).sendKeys("123456");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='Sign In']")).click();
	Thread.sleep(2000);

	String hpTitle=driver.getTitle();
	System.out.println("the home page title is:     " +hpTitle);

	driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
	Thread.sleep(2000);
	String campTitle=driver.getTitle();
	System.out.println("the Champaign page title is:     " +campTitle);

	driver.findElement(By.xpath("//a[text()='nisha']")).click();
	Thread.sleep(2000);
	String se=driver.getTitle();
	System.out.println("after selecting a campaign page title is:     " +se);

	driver.findElement(By.xpath("//input[@value='New Event']")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("subject")).sendKeys("lunch");
	Thread.sleep(2000);

	WebElement taskdes = driver.findElement(By.xpath("//textarea[@name='property(comments)']"));
			taskdes.sendKeys("first event");
			Thread.sleep(2000);

	driver.findElement(By.id("date")).sendKeys("11/15/2019");
	Thread.sleep(2000);
	driver.findElement(By.id("time")).sendKeys("01:30");
	Thread.sleep(2000);
	
	//to select duration hour drop down list
	driver.findElement(By.xpath("//select[@name='property(durationhrs)']/../../td[2]/select[1]/option[2]")).click();
	//Select dropdown = new Select(hour);
	//dropdown.selectByValue("2 hr");

	//to select duration min drop down list
	driver.findElement(By.xpath("//select[@name='property(durationmins)']/../../td[2]/select[2]/option[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("location")).sendKeys("empire");
	Thread.sleep(2000);
	driver.findElement(By.id("leContModName")).sendKeys("9845350759");
	Thread.sleep(2000);
	
	

	driver.findElement(By.xpath("//input[@value='Save & New Event']")).submit();
	Thread.sleep(2000);

	String eventdet = driver.getTitle();
	System.out.println("after creating new Event the page title is:     " +eventdet);
}
}