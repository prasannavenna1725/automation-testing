package mavenproj1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {
	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.id("visibleAfter")).getText());
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
