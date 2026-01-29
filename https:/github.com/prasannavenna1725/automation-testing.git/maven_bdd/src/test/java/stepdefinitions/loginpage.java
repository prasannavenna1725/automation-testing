package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpage {
	
	WebDriver driver;
	
	
	
	
	@Given("browser1 is login")
	public void browser1_is_open()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		
	}

	
	@When("enter login details<username> and <password>")
	public void enter_login_details_username_and_password() {
		driver.findElement(By.name("user-name")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("login-button")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	

	
	}

	@Then("page is navigated to website")
	public void page_is_navigated_to_website() {
}
}
