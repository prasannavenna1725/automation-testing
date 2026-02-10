package assurance_demo;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class testing {

    @DataProvider(name = "userIds")
    public Object[][] getUserIds() {
        return new Object[][] {
            {1, "Ody", "Rockey"},
            {2, "Harland", "Mawby"},
            {3, "Jed", "Franchi"}
        };
    }

    @Test(dataProvider = "userIds")
    public void validateUserDetails(int userId, String firstName, String lastName) {

        RestAssured.baseURI = "https://reqres.in";

        RestAssured
            .given()
            .header("x-api-key","reqres_e6f32fece630400ca1b5cf7550c3fce9")
            .when()
                .get("/api/users/" + userId)
            .then()
                .statusCode(200)
                .body("data.first_name", equalTo(firstName))
                .body("data.last_name", equalTo(lastName));
    }
}


