package api.request;

import api.payload.LoginPatientPayload;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginPatientRequest extends RestUtils {
	
	//Post Request
	
	public static Response postRequest(LoginPatientPayload payload) {
		try {

			response = given().
					contentType(ContentType.JSON).
					body(payload).
					log().all().
					when().post(routes.getString("user_PostEndpoint"));

		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	

}
	
	
	//Get Patient Morbidity datails  using PatientID
	//Get report details by patient id 
	public static Response getMorbidyByPatientId() {
		
		try {
			
			response = given().
					contentType(ContentType.JSON).
					log().all().
					when().
					get(routes.getString(""));
		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
		
	}
	//Get Patients report By FileID 
	
	
	
	
	
	
	
	
	
	
}