Feature: Login functionality of amazon application 


Scenario: User buy a product in Amazon 
	Given User launch application 
	Then User click the Todays deal 
	
Scenario: user signup in Amazon page 
	When User click on Signup button 
	
Scenario: User enter valid email id 
	When User enter "riyaolive20@gmail.com" in signin page 
	Then User click the continue button 
	
Scenario: User enter valid password 
	When User enter "Happie@20" as a password 
	Then User click the continue button 
	
Scenario: User verify the password 
	When User click the search button 
	
Scenario: User enter the otp 
	When User enter the "731154"" for validation 
	Then User click the login page 
	
