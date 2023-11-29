Feature: Shopping some items
  Background:
    Given the home page is opened
    And the 'Log out' is clicked
    And the 'Login' is clicked
    And the 'https://demowebshop.tricentis.com/login' page is opened
    And the 'email' field is filled with 'kamalatdinqdirniyazov@gmail.com'
    And the 'password' field is filled with 'SoftTest2023'
    And the 'Log in' is clicked
    And the 'https://demowebshop.tricentis.com/' page is opened
    And the 'kamalatdinqdirniyazov@gmail.com' text is shown

    #3 point
    Scenario: Shopping book
      Given the 'Books' is clicked
      And the 'https://demowebshop.tricentis.com/books' page is opened
      And the 'Computing and Internet' is added to the cart
      When the 'Shopping Cart' is clicked
      Then the price should read '10.00'
      When the 'Log out' is clicked
      Then the 'https://demowebshop.tricentis.com/' page is opened
      And the 'Register' text is shown


    #3 points
    Scenario: Buying belt
      Given the 'Appeals and Shoes' is clicked
      And the 'Casual Golf Belt' is added to the cart
      When the 'Shopping Cart' is clicked
      Then the price should read '11.00'
      And the 'Log out' is clicked
      And the 'https://demowebshop.tricentis.com/' page is opened
      And the 'Register' text is shown

    #3 points
    Scenario: Removing two items from cart
      Given the 'Shopping Cart' is clicked
      And the 'RemoveItem1' is clicked
      And the 'RemoveItem2' is clicked
      When the 'UpdateCart' is clicked
      Then the 'Your Shopping Cart is empty!' is shown
      And the 'Log out' is clicked



