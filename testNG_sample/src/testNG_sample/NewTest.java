package testNG_sample;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("near");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("far");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("there");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("here");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("where");
  }

}
