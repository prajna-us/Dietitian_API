package api.utilities;


import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import api.payload.*;
import io.restassured.response.Response;



public class RestUtils {

	public static ResourceBundle routes = ResourceBundle.getBundle("path");

	public static Logger log = LogManager.getLogger();

	//Schema and xcell path

	public static XLUtils xlutils=new XLUtils(routes.getString("Xlpath"));

	

	//payload objects
	
	
	public static LoginPatientPayload patientPayload = new LoginPatientPayload();
	
	//
	public static Response response;
}
