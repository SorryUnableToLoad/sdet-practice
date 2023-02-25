package bp.apipetprac;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class PetRequestChain {
	@Test
	public void uploadPetImage() {
		Category category = new Category(123, "Dog");
		String[] photoUrls = { "url1", "url2" };
		Tag[] tags = new Tag[] { new Tag(12, "Dog") };
		
		PetPojo petObj = new PetPojo(12, category, "Doggie", photoUrls, tags, "Available");
		
		Response response = RestAssured.given()
				.body(petObj)
				.contentType(ContentType.JSON)
				.baseUri("https://petstore.swagger.io/v2")
				.when()
				.post("/pet");
		response.then().log().all();
		 Object petId = response.jsonPath().get("id");
		System.out.println("Pet id from response: " + petId);

		RestAssured.given()
				.baseUri("https://petstore.swagger.io/v2")
				.pathParam("petid", petId)
				.multiPart(new File("C:\\Users\\HP\\Pictures\\DSC_0093.JPG"))
				.when()
				.post("/pet/{petid}/uploadImage")
				.then().log().all();

	}

	@Test
	public void validatePojoToJson() throws IOException {
		Category category = new Category(123, "Dog");
		String[] photoUrls = { "url1", "url2" };
		Tag[] tags = new Tag[] { new Tag(12, "Dog") };
		PetPojo petObj = new PetPojo(12, category, "Doggie", photoUrls, tags, "Available");

		ObjectMapper map = new ObjectMapper();
		String obj = map.writeValueAsString(petObj);
		System.out.println(obj);
	}
}
