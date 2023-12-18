package Page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page_Objects {

	@FindBy(xpath="//i[@class='pi pi-home layout-menuitem-icon']")
	public static WebElement HOMEICON;
	
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	public static WebElement DASHBOARD;
	
	@FindBy(xpath="//strong[contains(text(),'25,000')]")
	public static WebElement Text25000;
	
	@FindBy(xpath="//span[contains(text(),'Auth')]")
	public static WebElement Auth;
	
	@FindBy(xpath="//span[contains(text(),'Basic Auth')]")
	public static WebElement BASICAUTH;
	
	
	
	
}
