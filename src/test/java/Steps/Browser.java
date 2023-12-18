package Steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common_Utils.Launch_Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Browser extends Launch_Browser {
	public Logger logger = LogManager.getLogger(this.getClass());
	
	@Given("user login leafground page")
	public void userLoginLeafgroundPage() throws FileNotFoundException {
		Launch_Browser.Setup();
	  Properties prop = new Properties();
	  FileInputStream fis = new FileInputStream("C:\\Users\\jasai\\eclipse-workspace\\NewProject\\src\\test\\java\\resources\\log4j.properties");
	  PropertyConfigurator.configure(fis);
	   logger.info("--------------Launched the browser-------------------"); 
	    
	}
	@When("user clicks browser icon")
	public void userClicksBrowserIcon() {
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();     
		logger.info("Browser icon clicked");
	}
	@When("user see the frame icon click")
	public void userSeeTheFrameIconClick() {
		driver.findElement(By.xpath("//i[@class='pi pi-fw pi-stop layout-menuitem-icon']")).click();
		
	}
	@When("click on how many frames inside")
	public void clickOnHowManyFramesInside() {
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		   int noofframes= frames.size();
		   System.out.println("no of frames"+noofframes);
	    
	    
	    
	}
	@Then("get a number of frames")
	public void getANumberOfFrames() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		Launch_Browser.teardown();    
	}
	
	
	@When("user see the Alert icon click")
	public void userSeeTheAlertIconClick() {
		driver.findElement(By.xpath("//i[@class='pi pi-fw pi-clone layout-menuitem-icon']")).click(); 
	    
	}
	@When("click on alert simple dialog box")
	public void clickOnAlertSimpleDialogBox() {
		
		driver.findElement(By.xpath("//h5[contains(text(), 'Alert (Simple Dialog)')]/following::button")).click();
	    
	}
	@Then("get a popup alert click ok")
	public void getAPopupAlertClickOk() {
		Alert alert = driver.switchTo().alert();
		String text =alert.getText();
		System.out.println("Alert text is "+text);
		alert.accept();
		Launch_Browser.teardown();   
	    
	}
	
	@When("user see the window icon click")
	public void userSeeTheWindowIconClick() {
	    
	    
	}
	@When("click on open with delay button")
	public void clickOnOpenWithDelayButton() {
	    
	    
	}
	@Then("two windows need to popup")
	public void twoWindowsNeedToPopup() {
		Launch_Browser.teardown(); 
	    
	}




}
