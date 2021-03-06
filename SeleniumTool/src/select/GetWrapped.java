package select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrapped {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("file:///C:/Users/NISARGA/Desktop/sai/muliselect.html");

WebElement list=driver.findElement(By.id("mtr"));

Select s = new Select(list);

System.out.println(s.isMultiple());

WebElement wr = s.getWrappedElement(); //instead of for each loop
System.out.println(wr.getText());

	}

}
