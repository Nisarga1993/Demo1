package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontType {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("http://localhost/login.do");

WebElement a=driver.findElement(By.xpath("//div[text()='Login ']"));

String fontsize=a.getCssValue("font-size");
System.out.println("Font-size is:   "  +fontsize);

String color = a.getCssValue("color");
System.out.println("color is:   "  +color);

String fontfamily = a.getCssValue("font-family");
System.out.println("font family is:   "  +fontfamily);

String textalign = a.getCssValue("text-align");
System.out.println("text alignment is:   "  +textalign);

driver.close();
}

}
