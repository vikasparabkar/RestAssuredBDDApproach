package restAssuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class demo2_POST_Request {
	public static HashMap map= new HashMap();
	
	@BeforeClass
	public void testData() {
		map.put("title", RestUtils.title());
		map.put("body", RestUtils.body());
		map.put("userId", RestUtils.userId());
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
		
	}
	
	@Test
	public void testPost() {
		given()
			.contentType("application/json; charset=utf-8")
			.body(map)
		.when()
			.post()
		.then()
			.statusCode(201)
			.log().all();
	}
}
