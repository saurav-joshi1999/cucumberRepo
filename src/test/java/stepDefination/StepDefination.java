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
}
