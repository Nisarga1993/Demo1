package selEncapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
private	WebElement un;  //declaration
private WebElement pwd;
private WebElement login;
  
public LoginPage(WebDriver driver)       //initialization
{
	
	un=driver.findElement(By.id("username"));
	pwd=driver.findElement(By.name("pwd"));
	login=driver.findElement(By.xpath("//div[text()='Login ']"));
}

public void setUsername()                   //utilization
{
	un.sendKeys("admin");
}

public void setPassword()
{
pwd.sendKeys("manager");
}

public void setlogin()
{
	login.click();
}

}