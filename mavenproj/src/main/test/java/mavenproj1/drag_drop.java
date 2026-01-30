package mavenproj1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop");
		Thread.sleep(4000);
		WebElement From= driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();		
		Thread.sleep(4000);
		driver.quit();

}
}
