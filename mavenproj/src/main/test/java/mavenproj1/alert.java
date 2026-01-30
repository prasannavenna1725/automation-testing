package mavenproj1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("9999");
		driver.findElement(By.name("submit")).submit();
		Thread.sleep(8000);
		
		
		Alert alert = driver.switchTo().alert();
		Alert alertMessage = driver.switchTo().alert();
		System.out.println(alertMessage);
		alert.accept();
		driver.quit();
	
			
	}}