package restassured;

	
	import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
	import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class get_demo {
		
		@Test(enabled=true)
		void test_get()
		{
			baseURI = "https://reqres.in/api";
			
			given().header("X-api-key","reqres_e6f32fece630400ca1b5cf7550c3fce9")
			.get("/users?page=2")
			.then().statusCode(200).log().all();
			
		}
		
		@Test(enabled=false)
		void test_get1()
		{
			RequestSpecification httpRequest = RestAssured.given();
			httpRequest.header("X-api-key","reqres_e6f32fece630400ca1b5cf7550c3fce9");
			httpRequest.baseUri("https://reqres.in/api");
			Response response = httpRequest.get("/users?page=2");
			
			System.out.println(response.getBody().asString());
			System.out.println(response.getStatusCode());
			
			System.out.println(response.getStatusLine());
			System.out.println(response.getHeader("content-type"));
			
			int code = response.getStatusCode();
			Assert.assertEquals(code, 201);
			}
		
		@Test(enabled=false)
		void test_get2()
		{
          baseURI = "https://reqres.in/api";
			
			given().header("x-api-key","reqres_e6f32fece630400ca1b5cf7550c3fce9")
			.get("/users?page=2")
			.then().statusCode(200)
			.body("data[0].frist_name",equalTo("Michael"))
			.body("data.first_name",hasItems("Michael","Lindsay"));
		}
		
		@Test(enabled=false)
		void test_put()
		{
			
			JSONObject request = new JSONObject();
			request.put("name","venna");
			request.put("job","employee");
			
			given().
			header("Context_Type","application/json").
			header("x-api-key","reqres_e6f32fece630400ca1b5cf7550c3fce9").
					body(request.toJSONString()).
					when().
					put("https://reqres.in/api/users/2").
					then().
					statusCode(200).log().all();
		

		}
	}

