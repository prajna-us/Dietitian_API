package api.StepDefinition;

import static io.restassured.RestAssured.baseURI;

import java.io.IOException;

import api.request.DieticianRequest;
import api.requestbody.DieticianRequestBody;
import api.utilities.RestUtils;
import io.cucumber.java.en.*;



public class DieticianRoleSD extends RestUtils {
	
	
	@Given("Dietician creates POST Request")
	public void dietician_creates_post_request() {
		baseURI = BaseURI;
	}

	@When("Dietician sends HTTPS POST Request with login endpoint and request Body")
	public void dietician_sends_https_post_request_with_login_endpoint_and_request_body() throws IOException {
		dieticianPayload = DieticianRequestBody.dietloginCredentials();
		DieticianRequest.dieticianlogin(dieticianPayload);
	}

	@Then("User receives {int} Status Code")
	public void user_receives_status_Code(Integer statusCode) {
		response.then().assertThat().statusCode(statusCode);
	}
	

	
	@When("Dietician sends HTTPS POST Request and with valid request body and authentication token")
	public void dietician_sends_HTTPS_POST_request_and_with_valid_request_body_and_authentication_token() throws IOException {
		//generating a request body for creating newpatient
		newPatientPayload=DieticianRequestBody.newPatientCreation();
		//actually making the HTTPS POST request to create a new patient.
		DieticianRequest.createNewPatient(newPatientPayload);
	}
	
	
	
	
	
	@Given("User sets Authoization to Bearer Token")
	public void user_sets_authoization_to_bearer_token() {
	   
	}

	@Given("User creates POST Request for the PatientAPI endpoint")
	public void user_creates_post_request_for_the_patient_api_endpoint() {
	   
	}

	@When("User sends HTTPS Request and  request Body with mandatory {string}, additional {int} field")
	public void user_sends_https_request_and_request_body_with_mandatory_additional_field(String SheetName, int RowNumber ) {
	   
	}

	@Then("User receives  Created Status {int} with response body")
	public void user_receives_created_status_with_response_body(int createdStatus) {
	
	}

}
