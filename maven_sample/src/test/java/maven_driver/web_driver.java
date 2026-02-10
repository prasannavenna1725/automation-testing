package maven_driver;

public class web_driver {

	public static void main(String[] args)
	{
		System.out.println("hello and execute!!!");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://mvnrepository.com//");
Thread.sleep(8000);
Stirng pagtitle = driver.getT
	}
}
