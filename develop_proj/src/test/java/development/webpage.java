package development;


	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.cucumber.messages.types.Duration;
	public class webpage {
		WebDriver driver;
		
		@Given("user opens times india webpage")
		 public void user_opens_times_india_webpage()
				{
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://timesofindia.indiatimes.com/");
			//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
			
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
		}

		@When("user selects hindi language from dropdown")
		public void user_selects_hindi_language_from_dropdown()
		{
			driver.findElement(By.xpath("//*[@class='z89UZ undefined xGzbZ']"));
			
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}

		@Then("user enters into hindi language page")
		public void user_enters_into_hindi_language_page() {
			System.out.println("user entered successfully");
			driver.navigate().back();
			driver.quit();
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
		}

}
