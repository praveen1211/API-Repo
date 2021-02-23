package steps;

import java.security.Provider.Service;
import com.jayway.restassured.response.Response;

import getRequest.HomePage;
import io.cucumber.java.en.Given;

public class LoginSteps
{
	HomePage homePage = new HomePage();
	
	@Given("Verify the application is loaded or not")
	public void applicationLoaded() throws Exception
	{
		homePage.homepage_loadedOrNot();
	}
}

