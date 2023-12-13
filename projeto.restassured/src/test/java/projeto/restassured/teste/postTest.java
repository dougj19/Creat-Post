package projeto.restassured.teste;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class postTest {
	

	@Test
	public void postCreat() {

		RestAssured.baseURI = "https://reqres.in/api/";

		String payload = "{\n" + "    \"name\": \"morpheus\",\n" + "    \"job\": \"leader\"\n" + "}";

		String endpoint = "https://reqres.in/api/users";

		RestAssured.given().contentType(ContentType.JSON).body(payload).when().post(endpoint).then().statusCode(201);

		System.out.println("Usuario Criado com Sucesso!");

	}

}
