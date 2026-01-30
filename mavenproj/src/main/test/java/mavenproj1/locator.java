package mavenproj1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		Thread.sleep(4000);
		
		WebElement usrm=driver.findElement(By.id("user-name"));
				usrm.sendKeys("standard_user");
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("secret_sauce");
				WebElement login=driver.findElement(By.id("log in"));
				login.click();
				
				driver.quit();

				}

}
