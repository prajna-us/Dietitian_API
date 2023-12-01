package api.utilities;


import java.util.ResourceBundle;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import api.payload.*;
import io.restassured.response.Response;



public class RestUtils {

	public static ResourceBundle routes = ResourceBundle.getBundle("path");
	public static String BaseURI = routes.getString("baseURL");

	public static Logger log = LogManager.getLogger();

	//xcell path

	public static XLUtils xlutils=new XLUtils(routes.getString("Xlpath"));
	
	//Schema Path
	//public static File createDieticianLoginSchema = new File(routes.getString("createDieticianLoginSchema"));
	//public static File createNewPatientSchema=new File(routes.getString("createNewPatientSchema"));

	//payload objects
	
	
	public static LoginPatientPayload loginPatientPayload = new LoginPatientPayload();
	public static DieticianPayload dieticianPayload=new DieticianPayload();
	public static NewPatientPayload newPatientPayload=new NewPatientPayload();
	
	//
	public static Response response;

}
