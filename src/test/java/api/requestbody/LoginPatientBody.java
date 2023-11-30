package api.requestbody;

import java.io.IOException;

import api.payload.LoginPatientPayload;
import api.utilities.RestUtils;

public class LoginPatientBody extends RestUtils{
	
	//post request
	
	public static LoginPatientPayload postBody() throws IOException {
		
		patientPayload.setPatientEmail(xlutils.getCellData("Patient_Login_Post", 0, 0));
		patientPayload.setPatientPassword(xlutils.getCellData("Patient_Login_Post", 0, 1));
		
		return patientPayload;
	}
	
	

}
