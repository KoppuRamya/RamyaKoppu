package Com.stepdefinition;

import Com.pages.Placeorderpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Placeorder_stepdefinition
{
	Placeorderpage p=new Placeorderpage();
	@Given("^user launches ChromeBrowser$")
	public void user_launches_ChromeBrowser() 
	{
	    p.url();
	}

	@When("^the user open demoBlaze$")
	public void the_user_open_demoBlaze() 
	{
	    p.demoblaze_homePage();
	}

	@Then("^user will add the product and place the order$")
	public void user_will_add_the_product_and_place_the_order() throws InterruptedException 
	{
	   p.placeorder();
	}


}
