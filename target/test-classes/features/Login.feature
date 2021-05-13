
      
@tag3      
Feature: Application Login
@tag4
Scenario:  Home page default login
Given  User is on NetBanking login page
When   User login to application with username "Saurav" and password  "@Saurav"
Then   Home page is populated
And    Card are displayed "true"       
