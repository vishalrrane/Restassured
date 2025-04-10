package demo2_postrequests;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class hashmap {
	
	
	
	int id ;
	
	@Test( priority = 1)
	public void createuser() {
		
		
		
		HashMap data = new HashMap();
		data.put("name", "vishal");
		data.put("job", "Software Tester");
		
		given()
		 
		 .contentType("application/json")
		 .body(data)
		 
		 .when()
		 .post("https://reqres.in/api/users")
		 
		 
		 .then()
		 .statusCode(201)	
		 .log().all();
			
	}
	
	
	

}
