package api.requestbody;

import java.io.IOException;


import api.payload.DieticianPayload;
import api.payload.NewPatientPayload;
import api.utilities.RestUtils;


public class DieticianRequestBody extends RestUtils {
	

	//Fetch dietician login credentials from xl and store them in dieticianPayload object and can used for further process 
	public static DieticianPayload dietloginCredentials() throws IOException {
	dieticianPayload.setDieticianLoginEmail(xlutils.getCellData("DieticianRole", 0, 0));
	dieticianPayload.setdieticianPassword(xlutils.getCellData("DieticianRole", 0, 1));
	return dieticianPayload;
	}
	
	//
	
	public static NewPatientPayload newPatientCreation() throws IOException {
		
		newPatientPayload.setFirstName(xlutils.getCellData("PatientInfo", 0, 0));
		newPatientPayload.setLastName(xlutils.getCellData("PatientInfo", 0, 1));
		newPatientPayload.setContactNumber(xlutils.getCellData("PatientInfo", 0, 2));
		newPatientPayload.setEmail(xlutils.getCellData("PatientInfo", 0, 3));
		newPatientPayload.setAllergy(xlutils.getCellData("PatientInfo", 0, 4));
		newPatientPayload.setFoodCategory(xlutils.getCellData("PatientInfo", 0, 5));
		newPatientPayload.setDateOfBirth(xlutils.getCellData("PatientInfo", 0, 6));
	
	return newPatientPayload;
	
	
	
	
	
	
	
	
	
	
	
}





	
	/*
	public void createPatient() {
	File file = new File("/Dietician_API/src/test/resources/PatientReports/Diabetic and Hemogram Test_Thyrocare lab.pdf");  // Replace with the actual file path
    
    //   .multiPart("file", file);
HashMap<String, Object> patientInfo = new HashMap<>();
patientInfo.put("FirstName", "John");
patientInfo.put("LastName", "Ras");
patientInfo.put("ContactNumber", "5678903421");
patientInfo.put("Email", "abcthu@gmail.com");
patientInfo.put("Allergy", "Soy");
patientInfo.put("FoodCategory", "Vegan");
patientInfo.put("DateOfBirth", "1990-07-02");

//Convert patientInfo to JSON string
String patientInfoJson = "{" +
        "\"FirstName\":\"" + patientInfo.get("FirstName") + "\"," +
        "\"LastName\":\"" + patientInfo.get("LastName") + "\"," +
        "\"ContactNumber\":" + patientInfo.get("ContactNumber") + "," +
        "\"Email\":\"" + patientInfo.get("Email") + "\"," +
        "\"Allergy\":\"" + patientInfo.get("Allergy") + "\"," +
        "\"FoodCategory\":\"" + patientInfo.get("FoodCategory") + "\"," +
        "\"DateOfBirth\":\"" + patientInfo.get("DateOfBirth") + "\"" +
        "}";*/
	}
	


