Feature: Adding item to wishlist
  Background:
    Given the home page is opened
    And the 'Login' is clicked
    And the 'https://demowebshop.tricentis.com/login' page is opened
    And the 'email' field is filled with 'kamalatdinqdirniyazov@gmail.com'
    And the 'password' field is filled with 'SoftTest2023'
    When the 'Log in' is clicked
    Then the 'https://demowebshop.tricentis.com/' page is opened
    And the 'kamalatdinqdirniyazov@gmail.com' text is shown

    Scenario: Adding jewelry to the wishlist
      Given the 'JewelryNavButton' is clicked
      And the 'Diamond' is clicked
      When the 'AddToWishlist' is clicked
      Then the 'The product has been added to your wishlist' message is shown
