package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Elementspage {
	@Given("user login with leafground")
	public void userLoginWithLeafground() {
		Common_Utils.Launch_Browser.Setup();
		Common_Utils.Launch_Browser.driver.get("https://www.leafground.com/");
		Common_Utils.Initialize_Objects.initelements();
	   }

	@When("user clicks on element icon")
	public void userClicksOnElementIcon() {
		
		Page_Objects.Elements_Page_Objects.Element_ICON.click();

	}

	@When("clicks on waits")
	public void clicksOnWaits() {

	}

	@When("click Wait for Invisibility  also click")
	public void clickWaitForInvisibilityAlsoClick() {

	}

	@Then("i am about to hide button hides with in seconds")
	public void iAmAboutToHideButtonHidesWithInSeconds() {

	}

	@When("clicks on text box")
	public void clicksOnTextBox() {
		Page_Objects.Elements_Page_Objects.Text_Box.click();
		Page_Objects.Elements_Page_Objects.Append_country.clear();
	}

	@When("click clear the text")
	public void clickClearTheText() {
		Page_Objects.Elements_Page_Objects.Append_country.sendKeys("Tamilnadu");
		Common_Utils.Launch_Browser.teardown();
	}

	@Then("clear the text")
	public void clearTheText() {

	}

	@Then("confirm that text box is blank")
	public void confirmThatTextBoxIsBlank() {

	}

	@When("clicks on dropdown")
	public void clicksOnDropdown() {

	}

	@When("click choose course")
	public void clickChooseCourse() {

	}

	@Then("select palyright")
	public void selectPalyright() {

	}

}
