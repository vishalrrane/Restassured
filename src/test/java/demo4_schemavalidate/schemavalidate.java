package demo4_schemavalidate;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.* ;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import  static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;



import io.restassured.module.jsv.JsonSchemaValidator;

public class schemavalidate {
	
	@Test
	public void schemademo() {
		
		
        given().

		when()
		.get("https://reqres.in/api/users?page=2")

		 .then()
		.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));

}


	
	
	

}
