package demo1_Httprequest;


import static io.restassured.RestAssured.* ;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import  static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HttpRequest {
	
	
	int id;
	
	@Test( priority = 1)
	public void getuser() {
		
		
	
	 
	 when()
	 .get("https://reqres.in/api/users?page=2")
	 
	 
	 .then()
	 .statusCode(200)
	 .body("page",equalTo(2))
	 .contentType(" application/json")
	 .log().all();
	 

	}
	
	
	@Test( priority = 2)
	public void createuser() {
		
		
		
		HashMap data = new HashMap();
		data.put("name", "vishal");
		data.put("job", "SOftware Tester");
		
		id = given()
		 
		 .contentType("application/json")
		 .body(data)
		 
		 .when()
		 .post("https://reqres.in/api/users")
		 .jsonPath().getInt("id");
		 
		 
		/* .then()
		 .statusCode(201)	
		 .log().all();
			*/
	}
	
	
	@Test( priority = 3)
	public void updateuser() {
		
		
		HashMap data = new HashMap();
		data.put("name", "rane");
		data.put("job", "Tester");
		
		 given()
		 
		 .contentType("application/json")
		 .body(data)
		 
		 .when()
		 .put("https://reqres.in/api/users/"+id)
		 
		 .then()
		 .statusCode(200)
		 .log().all();
			
	}
	
	
	@Test( priority = 4)
	public void  deleteuser() {
		
       given()

		 .when()
		 .delete("https://reqres.in/api/users/"+id)
		 
		 
		 .then()
		 .statusCode(204)	
		 .log().all();
		
		
		
	}
	
	
	
		
		
	}
	
