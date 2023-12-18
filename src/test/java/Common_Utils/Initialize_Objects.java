package Common_Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page_Objects.Home_Page_Objects;

public class Initialize_Objects {
	
	
	
	public static void initelements() {
		
		PageFactory.initElements(Launch_Browser.driver,Page_Objects.Home_Page_Objects.class);
		
	}

}
