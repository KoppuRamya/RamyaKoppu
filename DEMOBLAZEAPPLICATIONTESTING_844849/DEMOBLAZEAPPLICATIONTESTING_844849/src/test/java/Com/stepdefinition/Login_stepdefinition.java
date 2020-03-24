package Com.stepdefinition;

import java.io.IOException;

import Com.pages.Loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_stepdefinition 
{
	Loginpage p=new Loginpage();
	@Given("^the user launched the chromebrowser$")
	public void the_user_launched_the_chromebrowser() 
	{
	 p.url();  
	}

	@When("^the user open the Demoblaze website$")
	public void the_user_open_the_Demoblaze_website()
	{
	   p.demoblaze_homePage();
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() 
	{
	    p.userclick();
	}

	@Then("^user will enter the username password using excel$")
	public void user_will_enter_the_username_password_using_excel() throws IOException, InterruptedException 
	{
		for(int i=1;i<=2;i++)
		   {
			   p.usernamepassword(i);
			   p.Assertion();
			   if(i<2)
			   {
				   p.url();
				   p.demoblaze_homePage();
				   p.userclick();
			   }
		   }
	}

	@Then("^handling the popup message by using assert$")
	public void handling_the_popup_message_by_using_assert() 
	{
	  System.out.println("succesfully handled popup");
	}

}
