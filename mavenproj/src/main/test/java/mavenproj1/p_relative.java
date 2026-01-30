package mavenproj1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p_relative {
	public static void main(String[] args)throws  InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@data-pid='2']")).click();
				driver.navigate().back();
				driver.quit();
				
	}

}
