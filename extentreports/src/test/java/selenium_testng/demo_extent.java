package selenium_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class demo_extent {

	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
	@BeforeClass
	public void starttest()
	{
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
	}
	@Test
	public void extenttest()
	{
		spark.config().setTheme(Theme.STANDARD);
	spark.config().setDocumentTitle("AutomationReport");
	spark.config().setReportName("ReportDemo");
	
	
	extent.attachReporter(spark);
	
	
	//create a test node in the report
	
	ExtentTest test = extent.createTest("login test").assignAuthor("venna").assignCategory("smoke").assignDevice("chrome");
	test.pass("login Test Successfull");
	test.info("url loaded");
	test.pass("login test completed successfully");
	
	
	//create test node in the report
	
	ExtentTest test1 = extent.createTest("homepage test").assignAuthor("venna").assignCategory("regression").assignDevice("chrome");
	test.pass("homepage successfull");
	test.info("value entered");
	test.fail("homepage test fails");
	
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	if(driver.getTitle().equals("Google"))
	{
		test.log(Status.PASS,"Navigated to the specified URL");
	}
	else
	{
		test.log(Status.FAIL, "Test Failed");
	}
	}
	
	@AfterMethod
	public void teardown()
	{
		extent.flush();
	
	
	
	}
	
}
