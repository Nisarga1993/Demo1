package launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
		new ChromeDriver();

	}

}
