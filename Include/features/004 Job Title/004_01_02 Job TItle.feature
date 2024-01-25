Feature: Job Title
Scenario: User Add Registered Job Title

Given User login and go to job title menu
When User registered a new job title
And User entered the previously registered job title 
Then User save changes
