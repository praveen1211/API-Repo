package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.APICallsList;

public class HomePage 
{

	@Test
	public void homepage_loadedOrNot() throws Exception
	{
		RestAssured.baseURI = APICallsList.LOGIN_URL;
        RequestSpecification request = RestAssured.given();
        
       Response response = request.request(Method.GET, "api/users/2");
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.getStatusCode());
        
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
	}
}
