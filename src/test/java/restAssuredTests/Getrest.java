package restAssuredTests;


import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getrest {
	@Test

	void testCase01(){
		Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println("Response code:"+res.getStatusCode());
	System.out.println("Response body:"+res.getBody().asString());
	System.out.println("Response Time:"+res.getTime());
	System.out.println("Response header:"+res.getHeader("Content-Type"));

	//validate Status code
	//expected Status code =200;

	int actualStatusCode= res.getStatusCode();
	int ExpectedStatusCode =200;
	AssertJUnit.assertEquals(ExpectedStatusCode,actualStatusCode); 

	}
	@Test
	void testCase02() {
	// giver,when then=
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured
		.given().queryParam("page", "2")
		.when().get()
		.then().statusCode(200);
		
	}
	}


