
      
@tag3      
Feature: Application Login
@tag4
Scenario:  Home page default login
Given  User is on NetBanking login page
When   User login to application with username "Saurav" and password  "@Saurav"
Then   Home page is populated
And    Card are displayed "true"   
And    This is Cucumber Git Test
 
Scenario:
 Given This is for develop branch
 When  After developing wiil be merged with main
 Then  Check if mergerd or not
 And   Also deployed to cucumberRepo    
