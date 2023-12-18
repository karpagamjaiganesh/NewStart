package Steps;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common_Utils.Launch_Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Table extends Launch_Browser{
	
	@Given("user need to launch chrome browser login Leafground page")
	public void userNeedToLaunchChromeBrowserLoginLeafgroundPage() {
		Launch_Browser.Setup();
		   }
	@Given("the click on Table icon")
	public void theClickOnTableIcon() {
		driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
	    }
	@When("user click on table link")
	public void userClickOnTableLink() {
		driver.findElement(By.xpath("//i[@class='pi pi-fw pi-table layout-menuitem-icon']")).click();
	}
	@Then("user is able to see multiple pages")
	public void userIsAbleToSeeMultiplePages() {
		Boolean status=driver.findElement(By.xpath("//span[contains(text(),'Customer Analytics Table')]")).isDisplayed();
		Assert.assertTrue(status);
		// find number of pages in table
		//List<WebElement> elements =driver.findElements(By.xpath("//table[@role='grid'][2]"));
		List<WebElement> header =driver.findElements(By.xpath("//th"));
		List<WebElement> data =driver.findElements(By.xpath("//td"));
		List<WebElement>tbody= driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']"));
		for (int i = 0; i < tbody.size(); i++) {
			String body=tbody.get(i).getText();
			System.out.println("Headings are"+body);
			
		}
		int headers=header.size();
		int totdata=data.size();
		System.out.println("no of headers"+headers);
		for (int i = 0; i < headers; i++) {
			String headings=header.get(i).getText();
			System.out.println("Headings are"+headings);
			
		}
		
		System.out.println("no of data"+totdata);
		for (int j = 0; j < totdata; j++) {
			String totaldata=data.get(j).getText();
			System.out.println(totaldata);
			
		}
		

	}
	@Then("user need to find the last page, no of row , columns and least date on the table")
	public void userNeedToFindTheLastPageNoOfRowColumnsAndLeastDateOnTheTable() {
		
		Launch_Browser.teardown();
	  }


}
