import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FetchingMultipleUserData {

	public static void main(String[] args) {
		//mention the base URI
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request=RestAssured.given();
		
		//make a request to server now
		Response response=request.get("api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().prettyPrint());
		String str1=response.asString();
		JsonPath js = new JsonPath(str1);
		System.out.println(js.get("data[0].id"));
	}

}
