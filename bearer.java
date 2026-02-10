package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class bearer {

	@Test(enabled = true)
	public void one()
	{
		RestAssured.baseURI="https://api.github.com";
		RestAssured.basePath="/users/prasannavenna-1725/repos";
		
		RequestSpecification requestspec = RestAssured.given();
		requestspec.header("Authorization","Bearer  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");
		
		Response response = requestspec.get();
		
		JsonPath jsonpath = response.jsonPath();
		String reposname = jsonpath.getString("name");
		
		System.out.println(reposname);
		
		Assert.assertEquals(response.statusCode(),200);
	}
}
