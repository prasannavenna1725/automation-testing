package mavenproj1;


	import org.openqa.selenium.*;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class locatorname {

	
		public static void main(String[] args)throws InterruptedException
		{
			System.out.println("hello and execute!!!");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			WebElement sb = driver.findElement(By.name("q"));
			sb.sendKeys("india");
			sb.sendKeys(Keys.ENTER);
			String actualUrl=driver.getCurrentUrl();
			System.out.println(actualUrl);
			Thread.sleep(7000000);

			driver.quit();
		}
}
