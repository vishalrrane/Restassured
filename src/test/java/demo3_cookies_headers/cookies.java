package demo3_cookies_headers;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.* ;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import  static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class cookies {
	
	
	
	
	
	
	@Test( priority = 1 ,enabled = false)
public void getcookies() {
	
	
	        given().

			when()
			.get("https://www.google.com/")

			 .then()
			 .cookie("AEC","AVcja2dft9dMs5C24mbU6BIYz_2WiPIRcyu1FqtO7tLZ_SPO-0i1MpGFgw")
			 .statusCode(200)
		     .contentType("application/json")
			 .log().all();

}
	
	@Test( priority = 2)
	public void getcookie_info() {
		
		
         Response res =  
         given().

		when()
		.get("https://www.google.com/");

		 //String cookievalue = res.getCookie("AEC");
		 
		// System.out.println("Value Of the Cookie is " +cookievalue);
		 
		 Map<String, String> cookiesvalue  = res.getCookies();
		 
		 System.out.println(cookiesvalue.keySet());
		 
		 for(String k : cookiesvalue.keySet() ) {
			 
			 String cookievalue = res.getCookie(k);
			 
			 System.out.println(k+ " : "+cookievalue);
			 
			 
			 
		 }
		 
		 
		 

}
	
	
	
	
	
	
	
	

}
