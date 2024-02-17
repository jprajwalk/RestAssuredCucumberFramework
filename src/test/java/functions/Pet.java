package functions;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;

public class Pet
{
	public static void 	Addanewpetpet() throws IOException
	{
		File file = new File("Input/Addanewpet.json");
		String requestbody = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
		
		RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

		RestAssured.baseURI = "https://petstore3.swagger.io/api/v3/pet";		
		Response request = RestAssured.given().log().method().when()
				.body(requestbody)
				.header("content-type","application/json")
				.post();
	}
	
	
	public static void 	Updatesapetinthestorewiththeformdata() throws IOException
	{
		RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

		RestAssured.baseURI = "https://petstore3.swagger.io/api/v3/pet/1";		
		Response request = RestAssured.given().log().method().when()
				.queryParam("name", "doggie")
				.header("content-type","application/json")
				.post();
	}
	
	public static void 	FindPetsbystatus() throws IOException
	{
		RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

		RestAssured.baseURI = "https://petstore3.swagger.io/api/v3/pet/findByStatus";		
		Response request = RestAssured.given().log().method().when()
				.queryParam("status", "pending")
				.header("content-type","application/json")
				.get();
	}
	
	public static void 	FindPetsbytags() throws IOException
	{
		RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

		RestAssured.baseURI = "https://petstore3.swagger.io/api/v3/pet/browno";		
		Response request = RestAssured.given().log().method().when()
				.queryParam("tags", "Browo")
				.header("content-type","application/json")
				.get();
	}
	
	public static void 	FindPetsbyID() throws IOException
	{
		RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

		RestAssured.baseURI = "https://petstore3.swagger.io/api/v3/pet/10";		
		Response request = RestAssured.given().log().method().when()
				.header("content-type","application/json")
				.get();
	}
		
	public static void 	Updateanexistingpet() throws IOException
	{
		File file = new File("Input/UpdateAnExistingPet.json");
		String requestbody = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
		
		RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

		RestAssured.baseURI = "https://petstore3.swagger.io/api/v3/pet";		
		Response request = RestAssured.given().log().method().when()
				.body(file)
				.header("content-type","application/json")
				.put();
	}
	
	public static void 	DeletethePet() throws IOException
	{
		RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

		RestAssured.baseURI = "https://petstore3.swagger.io/api/v3/pet/10";		
		Response request = RestAssured.given().log().method().when()
				.header("content-type","application/json")
				.delete();
	}
	
}
