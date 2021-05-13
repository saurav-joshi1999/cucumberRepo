package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {

	@Given("^User is on NetBanking login page$")
	public void User_is_on_NetBanking_login_page() throws Throwable {
		System.out.println("Nevigate to Login Page");
		System.out.println("This for Cucumber git purpose");
		System.out.println("This done by Cucumber main");
	}

	@When("^User login to application with username \"([^\"]*)\" and password  \"([^\"]*)\"$")
	public void user_login_to_application_with_username_and_password(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		System.out.println(arg2);
	}


	@Then("^Home page is populated$")
	public void Home_page_is_populated() throws Throwable {
		System.out.println("Hme page is populated");
	}

	@Then("^Card are displayed \"([^\"]*)\"$")
	public void card_are_displayed(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}
	
	@Then("^This is Cucumber Git Test$")
	public void this_is_Cucumber_Git_Test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Futher Cucumber git test by Cucumber main");
	}
	
	@Given("^This is for develop branch$")
	public void this_is_for_develop_branch() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
           System.out.println("Cucumber main Feature Changes");
	}

	@When("^After developing wiil be merged with main$")
	public void after_developing_wiil_be_merged_with_main() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Cucumber main Feature Changes");
	}

	@Then("^Check if mergerd or not$")
	public void check_if_mergerd_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Cucumber main Feature Changes");
	}

	@Then("^Also deployed to cucumberRepo$")
	public void also_deployed_to_cucumberRepo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Cucumber main Feature Changes");
	}

}
