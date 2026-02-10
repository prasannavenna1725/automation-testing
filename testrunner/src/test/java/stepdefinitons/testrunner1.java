package stepdefinitons;


	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/feature/googlesearch.feature",
	                 glue = "stepdefinitons" ,
	                 plugin = {"pretty","html:target/HtmlReports.html","json:target/JSONReports"},
	                 monochrome = true)
			
	public class testrunner1 extends AbstractTestNGCucumberTests{
			
	}



	
	





