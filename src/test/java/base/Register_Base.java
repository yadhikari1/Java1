package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Base {

	public static WebDriver driver;
	
	public void setUp() {
		driver= new ChromeDriver();
		
		
	}
	public void tearDown() {
		driver.quit();
	}
}
