package mavenproj1;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class explicit {
		public static void main(String[] args)throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/dynamic-properties");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));
			
			Thread.sleep(3000);
			driver.quit();
		}
}
