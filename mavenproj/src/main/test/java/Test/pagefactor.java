package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.pagefactor;

public class pagefactor {
	public static void main(String[] args)
	{
		WebDriver driver;
		pagefactor loginpage;
		
		driver = new ChromeDriver();
		loginpage = new loginpage(driver);
		
		loginpage.navigateTo();
		loginpage.login("standard_user" , "secret_sauce");
		
		loginpage.navigateTo();
		loginpage.login("invalid_user", "wrong_password");
		
		System.out.println(loginpage.getErrorMessage());
		
	}
	

}
