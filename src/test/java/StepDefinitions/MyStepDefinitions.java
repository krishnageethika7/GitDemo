package StepDefinitions;



import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	
	
	@Given("^User is landing on fb page$")
    public void user_is_landing_on_fb_page() throws Throwable {
		System.out.println("FB login page");
    }

    @When("^User login with valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_with_valid_credentials_something_and_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^Home page of FB is displayed \"([^\"]*)\"$")
    public void home_page_of_fb_is_displayed_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    }
    
    @When("^User login with following credentials$")
    public void user_login_with_following_credentials(DataTable data) throws Throwable {
        
      List<List<String>> obj=data.raw();
      
      System.out.println(obj.get(0).get(0));
      System.out.println(obj.get(0).get(1));
      
      
}
    @When("^User login with valid credentials (.+) and password (.+)$")
    public void user_login_with_valid_credentials_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }
    
    @Given("^validate the user$")
    public void validate_the_user() throws Throwable {
    	System.out.println("validating browser");
    	System.out.println("validating browser1");
    	System.out.println("validating browser2");
    	System.out.println("branching2");
    }

    @When("^Browser is invoked$")
    public void browser_is_invoked() throws Throwable {
    	System.out.println("calling browser");
    	System.out.println("branching");
    }

    @Then("^checkif browser is opened$")
    public void checkif_browser_is_opened() throws Throwable {
    	System.out.println(" browser opened");
    }
    
}