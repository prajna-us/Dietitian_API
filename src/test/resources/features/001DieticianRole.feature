
#
# Dietician will login using her credentials and sets Authoization to Bearer Token for login
# Authorization token will generate for dietician 
# Dietician will create patient  with valid endpoint and request body
#Check if user is able to retrieve patient file by fileId with valid API
#Check if user able to create a patient detail with valid endpoint and request body with existing values
#Check if user able to retrieve all patients with valid API
#Check if user able to update a patient detail by using patientId and patientInfo with valid endpoint and request body
#Delete patient  with valid PatientId
#Delete patient with Invalid PatientId
#Dietician LogOut

Feature: Dietician Feature

  Background:
    Given User sets Authoization to Bearer Token


  @01PostDieticianLoginWithValidCredentials
  Scenario: Dietician login with valid credentials
   Given Dietician creates POST Request 
    When Dietician sends HTTPS POST Request with login endpoint and request Body
    Then Dietician receives 200 Status Code
    
   @02PostCreateNewPatientWithValidBody
  Scenario: Dietician creates new patient with valid body
    Given Dietician creates  POST Request
    When Dietician sends HTTPS POST Request and with valid request body and authentication token
    Then Dietician receives 201 Status Code
    
    
    
    
    
    
    
    
    
    
    
    
  @01PostRequestWithValidCredentials
  Scenario Outline: Check if user able to create a patient detail with valid endpoint and request body
    Given User creates POST Request for the PatientAPI endpoint
    When User sends HTTPS Request and  request Body with mandatory "<SheetName>", additional <RowNumber> field
    Then User receives  Created Status 201 with response body
    
    Examples: 
    |SheetName|RowNumber|
    |PatientInfo|0			|