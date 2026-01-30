package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature_demo/searchprogram",
glue = {"stepdefinitions"} ,monochrome = true,

plugin = {"pretty","html:target/HtmlReports.html","json:target/JSONReports"})
		public class testrunner extends AbstractTestNGCucumberTests{
		
		
}


