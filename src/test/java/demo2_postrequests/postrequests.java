package demo2_postrequests;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.* ;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import  static org.hamcrest.Matchers.*;

import java.io.*;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.http.ContentType;
import io.restassured.internal.support.FileReader;

public class postrequests {
	
	
	
	int id ;
	
	@Test( priority = 1 , description = "post request Using Hashmap Method ",enabled = false)
	public void createuser() {
		
		
		
		HashMap data = new HashMap();
		data.put("name", "vishal");
		data.put("job", "Software Tester");
		
		given()
	     .contentType("Application/json")
	     .body(data)
		 
		 .when()
		 .post("https://reqres.in/api/users")
		 
		 
		 .then()
		 .body("name",equalTo("vishal"))
		 .body("job",equalTo("Software Tester"))
		 .contentType(" application/json")
		 .header("Content-Length","90")
		 .statusCode(201)
		 .log().all();
			
	}
	
	
	@Test(priority = 2,description = "Post request using Json Library ",enabled = false)
	public void createuser_json() {
			
	
		JSONObject js = new JSONObject();
		js.put("name", "Vish");
		js.put("job", "Automation tester");
		
		
		 given()
		 
		 .contentType("application/json")
		 .body(js.toString())
		
		.when()
		   .post("https://reqres.in/api/users")
				
		.then()
		.statusCode(201)
					
					  .body("name",equalTo("Vish")) 
					  .body("job", equalTo("Automation tester"))
					  .header("Content-Length","91")
	                  .log().all();
	
	} 

	
	
	@Test(priority = 3 , description =" Using Pojo class create user",enabled = false)
	public void createuser_pojo() {
		
		
		pojo_postrequest pj = new pojo_postrequest();
		pj.setName("Scott");
		pj.setJob("Developer");
		
		
		 given()
		 
		 .contentType("application/json")
		 .body(pj)
		
		.when()
		   .post("https://reqres.in/api/users")
				
		.then()
		.statusCode(201)
					  .body("name",equalTo("Scott")) 
					  .body("job", equalTo("Developer"))
					  .header("Content-Length","84")
	                  .log().all();
	
	
	}
		
		
		 @Test(priority = 4 , description =" Using External json file create user")
			public void createuser_jsonfile() throws FileNotFoundException {
					
		     File f = new File("E:\\Vishal_Desktop\\workspace3\\Restassured\\body.json");
		   java.io.FileReader fr = new  java.io.FileReader(f); 
		      JSONTokener js = new JSONTokener(fr);
		      JSONObject  data = new JSONObject(js);
		      
		      
		      
		      data.put("name", "Vish");
		      data.put("job", "Automation tester");
			
			
			 given()
			 
			 .contentType("application/json")
			 .body(data.toString())
			
			.when()
			   .post("https://reqres.in/api/users")
					
			.then()
			.statusCode(201)
						
						  .body("name",equalTo("Vish")) 
						  .body("job", equalTo("Automation tester"))
						  .header("Content-Length","983")
		                  .log().all();
		      
		      
		      
		      
		
	      }
	
	
	
	
	

}
