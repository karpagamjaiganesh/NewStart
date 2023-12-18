package Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage {
	
	@Given("user is in the landingpage")
	public void userIsInTheLandingpage() {
		Common_Utils.Launch_Browser.Setup();
		Common_Utils.Launch_Browser.driver.get("https://www.leafground.com/");
		Common_Utils.Initialize_Objects.initelements();
	   
	}
	@When("user clicks on home icon")
	public void userClicksOnHomeIcon() {
		Page_Objects.Home_Page_Objects.HOMEICON.click();
	    
	}
	@Given("user on home icon")
	public void userOnHomeIcon() {
	   System.out.println("------------------------------Home ICON clicked---------------------------------");
	    
	}
	@When("user clicks on dashboard")
	public void userClicksOnDashboard() {
		Page_Objects.Home_Page_Objects.DASHBOARD.click();
	    
	}
	@Then("user will on the dashboard page")
	public void userWillOnTheDashboardPage() {
	   Boolean avail= Page_Objects.Home_Page_Objects.Text25000.isDisplayed();
	    assertTrue(avail);
	    Common_Utils.Launch_Browser.teardown();
	    
	}
	
	@Given("user on home icon and auth")
	public void userOnHomeIconAndAuth() {
		Page_Objects.Home_Page_Objects.Auth.click();
	    
	}
	@When("user clicks on Auth and then basic auth popup window come up")
	public void userClicksOnAuthAndThenBasicAuthPopupWindowComeUp(DataTable dataTable) {
		Page_Objects.Home_Page_Objects.BASICAUTH.click();
		List<String> data=dataTable.asList(String.class);
		String username=data.get(0);
		String password = data.get(1);
		String s ="http://"+username+":"+password+"@"+"leafground.com:8090";
		Common_Utils.Launch_Browser.driver.get(s);
		
		
	}
	
	@When("user enters {string} and {string}")
	public void userEntersAnd(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 String msg ="Your authentication is successful";
			//  Assert.assertEquals(msg, );
			  Common_Utils.Launch_Browser.teardown();
	}

	

}
