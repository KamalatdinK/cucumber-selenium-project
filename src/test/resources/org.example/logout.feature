Feature: Logging out from account
  Background:
    Given the home page is opened
    #3 points
    Scenario: Login attempts with correct input
      Given the 'Login' is clicked
      And the 'https://demowebshop.tricentis.com/login' page is opened
      And the 'email' field is filled with 'kamalatdinqdirniyazov@gmail.com'
      And the 'password' field is filled with 'SoftTest2023'
      When the 'Log in' is clicked
      Then the 'https://demowebshop.tricentis.com/' page is opened
      And the 'kamalatdinqdirniyazov@gmail.com' text is shown
      When the 'Log out' is clicked
      Then the 'https://demowebshop.tricentis.com/' page is opened
      And the 'Register' text is shown