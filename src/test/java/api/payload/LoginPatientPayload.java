package api.payload;

public class LoginPatientPayload {
	private String email;
	private String password;
	
	public String getPatientEmail() {
		return email;
	}
	public void setPatientEmail(String email) {
		this.email = email;
	}
	public String getPatientPassword() {
		return password;
	}
	public void setPatientPassword(String password) {
		this.password = password;
	}
}
