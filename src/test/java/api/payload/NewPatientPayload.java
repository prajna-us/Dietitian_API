package api.payload;

import java.util.LinkedHashMap;
import java.util.Map;

public class NewPatientPayload {
	private String FirstName;
	private String LastName;
	private String ContactNumber;
	private String Email;
	private String Allergy;
	private String FoodCategory;
	private String DateOfBirth;

	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAllergy() {
		return Allergy;
	}
	public void setAllergy(String allergy) {
		Allergy = allergy;
	}
	public String getFoodCategory() {
		return FoodCategory;
	}
	public void setFoodCategory(String foodCategory) {
		FoodCategory = foodCategory;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
	//converting the data of object to map datastructure

	
	public Map<String,Object> convertToMap(){
		Map<String,Object> linkedHashMap=new LinkedHashMap<>();
		linkedHashMap.put("FirstName", FirstName);
		linkedHashMap.put("LastName", LastName);
		linkedHashMap.put("ContactNumber", ContactNumber);
		linkedHashMap.put("Email", Email);
		linkedHashMap.put("Allergy", Allergy);
		linkedHashMap.put("FoodCategory", FoodCategory);
		linkedHashMap.put("DateOfBirth", DateOfBirth);
	        return linkedHashMap;
	    }
		
	
	
}
