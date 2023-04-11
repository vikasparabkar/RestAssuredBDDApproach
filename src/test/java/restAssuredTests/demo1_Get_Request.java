package restAssuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



/*
 * given()
 * 		set cookies, add auth, add param, set headers info etc....
 * 
 * when()
 * 		get, post, put, patch, delete
 * 
 * then()
 * 		validate status code, extract response, extract header cookies & response body....
 */

public class demo1_Get_Request {
	@Test
	public void GetWeatherDetalis() {
		given()
			.when()
			.get("https://jsonplaceholder.typicode.com/posts/12")
			.then()
				.statusCode(200)
				.assertThat().body("id", equalTo(12))
				.header("Content-Type", "application/json; charset=utf-8")
				.log().all();
	}	
}
