package restassured;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
public class put_demo {
	
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
