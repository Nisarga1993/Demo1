package webelementmethods;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HeightAndWidthOfTB {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.opensourcebilling.org");

	WebElement un=driver.findElement(By.id("email"));
	int unheight = un.getSize().getHeight();
	System.out.println("Height of UN textbox is:    " +unheight  );
	
	int unwidth = un.getSize().getHeight();
	System.out.println("width of UN textbox is:    " +unwidth  );
	
	System.out.println("------------------------------------------");

	WebElement pwd=driver.findElement(By.id("password"));
	int pheight = pwd.getSize().getWidth();
	System.out.println("Height of PWD textbox is:    " +pheight  );
	
	int pwidth = pwd.getSize().getHeight();
	System.out.println("Width of PWD textbox is:    " +pwidth  );
	Thread.sleep(2000);
	
	driver.close();

}
}