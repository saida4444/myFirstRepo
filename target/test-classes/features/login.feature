Feature: Login to Retail Website 

#Each feature file starts with Feature keyword and name for feature file
# Each scenario starts with Scenario keyword and : then name of scenario
#Given is used for precondition 
#When is used for an action 
#And is used for actions step following When keyword
#Then is used for expected result and writing assertions.
# Scenario  runs once with provided data 
#scenario outline will run same scenario with multiple set of data and 
#we use Examples keyword to store the data under it.
# we can write same step N times as long as they are the same( case sensitive, and no extra space)
# but in step Definition we should have only one step associated with this step. 
#The Background Keyword will host any step or steps that are repeated at the 
#beginning of each scenario in feature file

Background: 
	Given user is on Retail website 
	When user click on Myaccount 
	
@smokeTest @Regression @endtoendTesting 
Scenario: Retail website Login test 
	And user click on Login option 
	And user enter userName 'eagles@tekschool.us' and password 'eagles' 
	And user click on Login Button 
	Then user should be logged in to Myaccount dashboard 
	
@endtoendTesting 
Scenario Outline: Retail website Login test with multiple accounts 

	And user click on Login option 
	And user enter userName '<userName>' and password '<password>' 
	And user click on Login Button 
	Then user should be logged in to Myaccount dashboard 
	
	Examples: 
		|userName|password|
		|eagles@tekschool.us|eagles|
		|hawks@tekschool.us|hawks|
		|falcons@tekschool.us|falcons|
		
	
		
		
		
		
		
			
			
			
			
			
			
			
			
			
