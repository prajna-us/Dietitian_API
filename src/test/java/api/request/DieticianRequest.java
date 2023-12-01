package api.request;

import api.payload.DieticianPayload;
import api.payload.NewPatientPayload;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import java.util.Map;
import java.nio.file.Path;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DieticianRequest extends RestUtils {
	
	public static Response dieticianlogin(DieticianPayload dieticianpayload) {
		try {
			response = given().
					   contentType(ContentType.JSON).
					   body(dieticianpayload)
					   .when()
					   .post(routes.getString("dietician_PostEndpoint"));
						dieticianpayload.setToken(response.jsonPath().getString("token"));
						response.jsonPath().getString("token");
						
						/*response.then().
						assertThat().
						body(matchesJsonSchema(routes.getString("createDieticianLoginSchema")));*/
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;

	}
	

	public static Response createNewPatient(NewPatientPayload newPatientPayload) {
		try {
				
		String	patientdiabeticReportFilePath =routes.getString("diabeticReport");
		
		//convert the file path string into a Path object.
		Path patientDiabeticReport = Path.of(patientdiabeticReportFilePath);
		
		
		/* Read the file content as bytes
		byte[] dibeticReportBytes = Files.readAllBytes(patientDiabeticReport);*/
		
		// Convert the patient information to a Map.converting the payload object into a key-value mapping
		Map<String, Object> payloadMap = newPatientPayload.convertToMap();
		
		/*Add the report bytes to the payload
		payloadMap.put("patientReport", dibeticReportBytes);*/
		
		// creates an instance of the ObjectMapper class from the Jackson library.
		//The ObjectMapper is used to convert objects(payload map) to JSON string using writevalueasstring method.
		//Serialization refers to converting the payloadMap object (which likely contains key-value pairs) into a JSON string representation.
		ObjectMapper objectMapper = new ObjectMapper();
		//
		String payloadAsString = objectMapper.writeValueAsString(payloadMap);
	

			response = given()
					.header("Authorization", "Bearer " + dieticianPayload.getToken())
					.header("Accept", "*/*")
					.header("Content-type", "multipart/form-data")
					.multiPart("file",patientDiabeticReport.toFile())
					.formParam("patientInfo", payloadAsString)
					.log().all()
					.when().post(routes.getString("Create_New_Patient"));
					response.then().log().all();
					
					dieticianPayload.setPatientId(response.jsonPath().getInt("patientId"));
					String email = response.jsonPath().getString("Email");
					// sets the extracted email value in the loginPatientPayload objec
					loginPatientPayload.setUserLoginEmail(email);
					//Below line asserts that the response body matches a JSON schema
					/*response.
					then().
					assertThat().
					body(matchesJsonSchema(routes.getString("createNewPatientSchema")));*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;

	}
	
	
	
}
