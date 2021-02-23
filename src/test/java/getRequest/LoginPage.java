package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;
import resources.APICallsList;
import resources.StaticData;

public class LoginPage 
{
   @Test
	public void login_Auth() throws Exception
	{
	   
		 	RestAssured.baseURI = APICallsList.LOGIN_URL;
	        RequestSpecification request = RestAssured.given();
	        
	        request.header("Content-Type", "application/json");
	        
	        JSONObject requestParams = new JSONObject();
	       
	        requestParams.put(StaticData.USERNAME, "TOOLSQA-Test");
	        requestParams.put(StaticData.PASSWORD, "Test@@123");
	 
	        request.body(requestParams.toJSONString());
	        Response response = request.post("/Account/v1/User");
	 
	        Assert.assertEquals(response.getStatusCode(), 201);
	        String userID = response.getBody().jsonPath().getString("userID");
	}
}
