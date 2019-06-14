package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	 static {
		 System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	 }
	
	
//	public void openDriver() {
//		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	//}
	
	 protected static WebDriver driver = new ChromeDriver();
	 
	 

}
