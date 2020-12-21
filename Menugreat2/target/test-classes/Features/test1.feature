 Feature: Check menugreat console functionality

  Scenario Outline: User is logged in
    Given browser is open
    When user is on the login page
    When user enters <username> and <password>
    And user clicks login button
    And user navigate to dashboard
    And user click userinfo button
    And user click logout button
    Then user navigate to homepage
   
   Examples:
   |username|password|
   |mehedi.hasan@orocube.net|2222|
   |orocube@orotab.com|1111|

 