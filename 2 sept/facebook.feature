Feature: sanity test cases for facebook

Scenario: login test cases
Given user opens chrome
When user enters login crdentials
And click on login button
Then login should be succesful

Scenario: find a friend Test case
Given user is on landing page
When clicks on friend page link
Then user should be navigated to that page
