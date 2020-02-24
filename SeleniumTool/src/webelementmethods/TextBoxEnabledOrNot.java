
	package webelementmethods;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TextBoxEnabledOrNot {
			static {
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
			}

	public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.opensourcebilling.org");

	WebElement un=driver.findElement(By.id("email"));

	if(un.isEnabled())
	{
		System.out.println("The Text Box is enabled");
	}
	else
	{
		System.out.println("The Text Box is not enabled");	
		 
	}
	driver.close();
			}
		}
