Feature: Test Feature for Lab 

@test 
Scenario: Test case 
	Given user is on Retail website 
	When user search for 'iphone' 
	Then iphone should be displayed 
	

Scenario: Testcase number 2 
	Given user is on amazon 
	When user click on myaccount 
	Then user should see account information 
	
	
Scenario: Testcase number 3 
	Given user is on facebook 
	When user login 
	Then user should be logged in