package Page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements_Page_Objects {
	
	@FindBy(xpath="//i[@class='pi pi-server layout-menuitem-icon']")
	public static WebElement Element_ICON;
	
	@FindBy(xpath="//span[contains(text(),'Text Box')]")
	public static WebElement Text_Box;
	
	@FindBy(xpath="//*[@id='j_idt88:j_idt91']")
	public static WebElement Append_country;
	
	@FindBy(xpath="//span[@class='ui-button-icon-left ui-icon ui-icon-calendar']")
	public static WebElement confirm_date;
	
	@FindBy(xpath="//a[contains(text(),'25')]")
	public static WebElement Select_date;
	
	@FindBy(id="j_idt106:j_idt116_input")
	public static WebElement verify_date;
	
	@FindBy(xpath="//span[contains(text(),'Dropdown')]")
	public static WebElement Dropdown;

}
