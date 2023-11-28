Feature: Shopping items
  Background:
    Given the 'Login' is clicked
    And the 'https://demowebshop.tricentis.com/login' page is opened
    And the 'email' field is filled with 'kamalatdinqdirniyazov@gmail.com'
    And the 'password' field is filled with 'SoftTest2023'
    And the 'Log in' is clicked
    And the 'https://demowebshop.tricentis.com/' page is opened
    And the '<email>' text is shown

    #3 point
    Scenario: Shopping the cheapest and the most expensive PCs
      Given the 'Books' is clicked
      And the 'https://demowebshop.tricentis.com/books' page is opened
      When the 'Computing and Internet' is added to the cart
      And the 'Fiction' is added to the cart
      Then the price should read '34.00'