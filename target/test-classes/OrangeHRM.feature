@smokeTest @regressionTest
Feature: Verify login feature in Orange HRM website

Scenario: Akash able to successfully login to Orange HRM site
Given Akash go to Orange HRM home page
When Akash enter valid AkashName and password
And Akash click on the login button
Then Akash navigate to the welcome page
#And Akash verify AkashName is display at top right 
Then Akash logout
And Akash close browser