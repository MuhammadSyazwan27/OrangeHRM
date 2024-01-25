Feature: Job Categories
Scenario: User Delete Multiple Job Category

Given User go to login page
When User delete a job category
And User delete another job category
Then User successfully delete more than one job category
