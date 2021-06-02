package Examples;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.equalTo;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

@Test (priority=1)
public class Activity1 {
	  final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";
	
  public void addnewPet() {
	  
      String reqBody = "{"
    			
            + "\"id\": 2543,"
	
            + "\"name\": \"Dolly\","
	
            + " \"status\": \"alive\""
	
        + "}";
   
    	Response response = 
    	    	
                given().contentType(ContentType.JSON) // Set headers
    	
                .body(reqBody) // Add request body
    	
                .when().post(ROOT_URI); // Send POST request
		
        response.then().body("id", equalTo(2543));
    	
        response.then().body("name", equalTo("Dolly"));
	
        response.then().body("status", equalTo("alive"));
    	
  }
  @Test(priority=2)
  
  public void getPetInfo() {
		
      Response response = 
	
          given().contentType(ContentType.JSON) // Set headers
	
          .when().pathParam("petId", "2543") // Set path parameter
	
          .get(ROOT_URI + "/{petId}"); // Send GET request
	

	
      // Assertion
	
      response.then().body("id", equalTo(2543));
	
      response.then().body("name", equalTo("Dolly"));
	
      response.then().body("status", equalTo("alive"));
	
  }
  
  @Test(priority=3)
	
  public void deletePet() {
	
      Response response = 
	
          given().contentType(ContentType.JSON) // Set headers
	
          .when().pathParam("petId", "2543") // Set path parameter
	
          .delete(ROOT_URI + "/{petId}"); // Send DELETE request
	

	
      // Assertion
	
      response.then().body("code", equalTo(200));
	
      response.then().body("message", equalTo("2543"));
	
  }
  
}
