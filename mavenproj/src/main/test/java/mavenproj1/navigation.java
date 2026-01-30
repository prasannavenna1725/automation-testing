package mavenproj1;


	import org.openqa.selenium.*;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class navigation {
	
		public static void main(String[] args)throws InterruptedException
		{
			System.out.println("hello and execute!!!");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com");
			driver.navigate().refresh();
			driver.navigate().back();
			driver.navigate().forward();
			Thread.sleep(4000);
			String pagetitle = driver.getTitle();
			driver.findElement(By.linkText("Gmail")).click();
			driver.navigate().back();
			//driver.quit();

}
}