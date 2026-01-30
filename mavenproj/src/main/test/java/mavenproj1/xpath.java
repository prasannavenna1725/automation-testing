package mavenproj1;


	import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


	public class xpath {
		public static void main(String[] args)throws InterruptedException
		{
			System.out.println("hello and execute!!!");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			String pagetitle = driver.getTitle();
			driver.findElement(By.xpath("//a[text()='Gmail']")).click();
			
	
			driver.navigate().back();
			driver.quit();
			

}
	}
