package mavenproj1;


	import org.openqa.selenium.*;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class frames {

	
		public static void main(String[] args)throws InterruptedException
		{
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/frames");
			 
			driver.findElement(By.linkText("NestedFrames")).click();
			driver.switchTo().frame("frame-bottom");
			WebElement v = driver.findElement(By.cssSelector("body"));
			System.out.println("Bottom frame text :" +v.getText());
			driver.switchTo().parentFrame();
			driver.switchTo().frame("frame-top");
			driver.switchTo().frame(1);
			WebElement m = driver.findElement(By.id("content"));
			System.out.println(m.getText());
			
			
			Thread.sleep(2000);
			
		}}

		
