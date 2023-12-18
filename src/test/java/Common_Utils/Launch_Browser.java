package Common_Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch_Browser {
	
	public static WebDriver driver;
	// testing git hub
	
	public static void Setup() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/");
		}

	
	public static void teardown()
	{
		driver.quit();
	}
}

