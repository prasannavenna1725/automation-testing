package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ResponseOptions;

public class auth_demo {
	@Test
	void dis()
	{
		RestAssured.baseURI="https://api.github.com";
		String ep = "/users/prasannavenna-1725/repos";
		String token = "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";
	
		ResponseOptions res2 = (ResponseOptions) RestAssured
				.given()
				.auth().oauth2(token)
				.get(ep).getBody();
		System.out.println(res2.toString());
	}

}
