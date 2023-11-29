Feature: Shopping gift cards
  Background:
    Given the home page is opened
    And the 'Login' is clicked
    And the 'https://demowebshop.tricentis.com/login' page is opened
    And the 'email' field is filled with 'kamalatdinqdirniyazov@gmail.com'
    And the 'password' field is filled with 'SoftTest2023'
    And the 'Log in' is clicked
    And the 'https://demowebshop.tricentis.com/' page is opened
    And the 'kamalatdinqdirniyazov@gmail.com' text is shown

    #3 points
    Scenario: Buying giftcard for 25 and removing it
      Given the 'Gift Cards' is clicked
      And the 'GIFTCARD25LINK' is clicked
      And the 'https://demowebshop.tricentis.com/25-virtual-gift-card' page is opened
      And the 'RecipientName' field is filled with 'Cillian Murphy'
      And the 'RecipientEmail' field is filled with 'c.murphy@gmail.com'
      And the 'MessageField' field is filled with 'Hello, nice to meet you'
      And the 'AddGift25ToCart' is added to the cart
      And the 'Shopping Cart' is clicked
      And the price should read '25.00'
      And the 'RemoveGiftCard25' is clicked
      When the 'UpdateCart' is clicked
      Then the 'Your Shopping Cart is empty!' is shown
      And the 'Log out' is clicked

    #3 points
    Scenario: Trying to buy giftcard with incorrect email
      Given the 'Gift Cards' is clicked
      And the 'GIFTCARD25LINK' is clicked
      And the 'https://demowebshop.tricentis.com/25-virtual-gift-card' page is opened
      And the 'RecipientName' field is filled with ''
      And the 'RecipientEmail' field is filled with 'johnnydepp'
      And the 'MessageField' field is filled with 'happy New Year'
      When the 'AddGift25ToCart' is added to the cart
      Then the 'Enter valid recipient email' and 'Enter valid recipient name' message is popped up











