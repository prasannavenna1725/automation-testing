package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactor {
	private WebDriver driver;
	private final String url = "https://www.saucedemo.com/";
	
	//webelements using @findby
	@FindBy(id = "user-name")
	private WebElement usernameField;
	
	@FindBy(id = "password")
	private WebElement passwordField;
	
	@FindBy(id = "login-button")
	private WebElement logiButton;
	
	@FindBy(css = "h3[data-test = 'error']")
	private WebElement errorMessage;
	
	
	//constructor 
	 public pagefactor(WebDriver driver)
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	 }
	
	
			
	

}
