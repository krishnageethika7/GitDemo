package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforevalidation()
	{
		System.out.println("before hook");
	}

	@After("@MobileTest")
	public void aftervalidation()
	{
		System.out.println("before hook");
	}
}
