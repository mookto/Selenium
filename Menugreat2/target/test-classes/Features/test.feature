Feature: Check menugreat console functionality

  Scenario Outline: User is logged in
    Given browser is open
    When user is on the login page
    When user enters <username> and <password>
    And user clicks login button
    Then user navigate to dashboard
   
   Examples:
   |username|password|
   |mehedi.hasan@orocube.net|1111|
   |orocube@orotab.com|1111|

