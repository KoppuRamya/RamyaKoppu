package Com.stepdefinition;

import Com.pages.Loginandlogoutpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginandLogout_stepdefinition 
{
	Loginandlogoutpage p=new Loginandlogoutpage();
	@Given("^user launched the chromebrowser$")
	public void user_launched_the_chromebrowser() 
	
	{
	   p.url();
	}

	@When("^the user opens Demoblazeapplication$")
	public void the_user_opens_Demoblazeapplication() 
	{
	    p.demoblaze_homePage();
	}

	@Then("^user will click on the loginbutton$")
	public void user_will_click_on_the_loginbutton() 
	{
	   p.userclick();
	}

	@Then("^user will enter credentials$")
	public void user_will_enter_credentials() 
	{
	    p.usernamepassword("Ramya","ramya");
	}

	@Then("^user will logout$")
	public void user_will_logout() throws InterruptedException 
	{
	    p.logout();
	}

}
