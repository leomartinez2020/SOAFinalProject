package Requests;

import Utils.SetProperties;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class DeleteRequests extends SetProperties {
    PostRequests postRequest = new PostRequests();
    private String moviePath = "/movie/";
    public DeleteRequests() {
        super();
    }
    public void deleteRating(int movieId) {
        Response response = given()
                .contentType(ContentType.JSON)
                .queryParam("api_key", getApi_key())
                .queryParam("session_id", postRequest.createSession())
                .when()
                .delete(getBase_url() + moviePath + movieId + "/rating")
                .then()
                .statusCode(200)
                .extract()
                .response();
        Assert.assertEquals("The item/record was deleted successfully.", response.jsonPath().getString("status_message"));
    }
}
