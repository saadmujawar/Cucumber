package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


@RunWith(Cucumber.class)
public class stepDefination {
	
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_netBanking_landing_page() 
	{
		//code to user navigate to landing page
		System.out.println("navigated to login url");
	}
	
	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() 
	{
		System.out.println("Logged In success");
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated()
	{
		System.out.println("Validated home page");
	}
	
	@And ("^Cards are displayed$")
	public void cards_are_displayed() 
	{
		System.out.println("Validated cards");
	}
	
	
	

}
