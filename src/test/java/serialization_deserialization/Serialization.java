package serialization_deserialization;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.* ;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import  static org.hamcrest.Matchers.*;

public class Serialization {

	// convert POJO to json 
	
	@Test
	public void pojotest() {
		
		
		pojo pj = new pojo();
		pj.setName("Vishal");
		pj.setJob("SDET");
		
		
		com.fasterxml.jackson.databind.ObjectMapper mp = new com.fasterxml.jackson.databind.ObjectMapper();
		
		 given()
		 
		 .contentType("application/json")
		 .body(pj)
		
		.when()
		.post("")
		
		.then()
		
		;
		
		
		
		
		
		
	}
	
	

}
