package mavenproj1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class dropdwn {
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
			WebElement drpdwn;
			drpdwn = driver.findElement(By.name("country"));
			Select sel = new Select(drpdwn);
		sel.selectByVisibleText("INDIA");
		
		boolean displayed = drpdwn.isDisplayed();
		boolean Enabled = drpdwn.isEnabled();
		Thread.sleep(3000);
		sel.selectByValue("ALGERIA");
		sel.selectByIndex(1);
		System.out.println(displayed);
		System.out.println(Enabled);
		
		
		
					
			Thread.sleep(4000);
		}		

}
