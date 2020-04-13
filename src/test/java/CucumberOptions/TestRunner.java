package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/Features", glue="StepDefinitions", tags="@MobileTest",monochrome=true,

	plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cuckes.xml"})

public class TestRunner {
	

	}
	
	


