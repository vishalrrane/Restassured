package demo3_cookies_headers;


import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.* ;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import  static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;






public class headers {
	
	
@Test( priority = 1 )
public void testheaders() {
	
	
	        given().

			when()
			.get("https://www.google.com/")

			 .then()
			 .header("Content-Type","text/html; charset=ISO-8859-1")
			 .header("Content-Encoding", "gzip")
			 .header("Server","gws")
			 .statusCode(200);

}



@Test( priority = 1 )
public void getheaders() {


       Response res =
        given().

		when()
		.get("https://www.google.com/");

		Headers headers =res.getHeaders();
		System.out.println(headers.asList());

	
	 	
		for (Header hd:headers){
			
		System.out.println(hd.getName()+"    "+ hd.getValue());
			
		}
		
		
		
		
 }

	
	
	

}
