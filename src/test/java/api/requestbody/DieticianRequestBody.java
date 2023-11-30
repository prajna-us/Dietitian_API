package api.requestbody;

import java.util.*;

import api.utilities.RestUtils;

import java.io.File;
public class DieticianRequestBody extends RestUtils {
	
	
	
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
        "}";
	}
	

}
