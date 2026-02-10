package parameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

public class pathquery {
	
	
	@Test
	void get()
	{
baseURI = "https://reqres.in//api";
		
		given().header("x-api-key","reqres_e6f32fece630400ca1b5cf7550c3fce9")
		.pathParam("resource", "users")
		.queryParam("page", 2)
		//.when()
		//.get("/users?page=2")
		.get("/{resource}")
		
		.then().statusCode(404)
		.body("data[0].frist_name",equalTo("prasanna"))
		.body("data.first_name",hasItems("prasanna","sai"));
	}

}




