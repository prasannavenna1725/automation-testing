package mavenproj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p_absolute {

	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/header/div[1]/div[2]/a")).click();
		driver.quit();
	}
}
