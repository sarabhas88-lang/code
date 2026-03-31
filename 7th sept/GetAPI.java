import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAPI {

	public static void main(String[] args) {
		//base URI
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request=RestAssured.given();
		
		Response response=request.get("api/users/2");
		System.out.println(response.getStatusCode());
		
//		System.out.println(response.getBody().prettyPrint());
//		System.out.println(response.getBody().asString());
		
		//how to fetch the value from Json/Response 
		String str=response.getBody().asString();
		
		JsonPath js = new JsonPath(str);
		System.out.println(js.get("data.id"));
		System.out.println(js.get("data.email"));
		System.out.println(js.get("data"));



	}

}
