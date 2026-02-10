package project_bdd;


	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;


import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	        features = "src/test/resources/feature/login.feature",
	        glue = "project_bdd",
	        plugin = {"pretty","html:target/cucumber-reports.html"},
	        monochrome = true)
	public class testrunner  {
	}
	

