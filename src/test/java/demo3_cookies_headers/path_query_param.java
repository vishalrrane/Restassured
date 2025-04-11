package demo3_cookies_headers;
import static io.restassured.RestAssured.* ;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import  static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;

public class path_query_param {
	
	
	
	
	
	
	
	
	
	
//	https://reqres.in/api/users?page=2&id=7
		
		
		
		@Test( priority = 1)
	public void getuser() {
		
		
	given()
	.pathParam("mypath","users")
	.queryParam("page", 1)
	.queryParam("id", 7)
	 
	 .when()
	 .get("https://reqres.in/api/{mypath}")
	 
	 
	 .then()
	 .statusCode(200)
	 .contentType("application/json")
	 .log().all();
	 

	}
	

}
