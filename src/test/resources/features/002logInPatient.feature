
#Patient will login with valid credentials given by organizer
#And save the bearer token which will generate automatically
#Get Patient Morbidity datails  using PatientID
#Get Patients File By FileID 
#

Feature: Patient Feature

  @POSTPatientUserLogin
  Scenario: Patient login with valid credentials


  @GETPatientMorbidityDetails
  Scenario: Get Patients Morbidity datails with PatientID
  

  @GETPatientFileByFileIDloginAsPatient
  Scenario: Get Patients File By FileID 
 


