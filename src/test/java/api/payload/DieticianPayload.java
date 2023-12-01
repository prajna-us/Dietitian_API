package api.payload;

public class DieticianPayload {

	private String token;
	private String userId;
	private String dieticianPassword;
	private String dieticianLoginEmail;
	private Integer patientId;
	private String fileId;
	private String morbidityTestName;

	
	// For logging in as a dietician
	
	public String getDieticianLoginEmail() {
		return dieticianLoginEmail;
	}

	public void setDieticianLoginEmail(String dieticianEmail) {
		this.dieticianLoginEmail = dieticianEmail;
	}
	
	public String getDieticianPassword() {
		return dieticianPassword;
	}

	public void setdieticianPassword(String dieticianpassword) {
		this.dieticianPassword = dieticianpassword;
	}

	//
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public String getMorbidityTestName() {
		return morbidityTestName;
	}

	public void setMorbidityTestName(String morbidityTestName) {
		this.morbidityTestName = morbidityTestName;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	
	
	
}
