package mavenproj1;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
	public static void main(String[] args)throws InterruptedException
	{
		System.out.println("hello and execute!!!");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		driver.quit();
	}

}
