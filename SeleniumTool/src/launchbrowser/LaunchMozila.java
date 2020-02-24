package launchbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchMozila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String key="webdriver.gecko.driver";
String value="./driver/geckodriver.exe";
System.setProperty(key, value);
new FirefoxDriver();
	}

}
