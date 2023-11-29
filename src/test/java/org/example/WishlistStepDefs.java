package org.example;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WishlistStepDefs extends AbstractStepDefs{
    @Then("the {string} message is shown")
    public void wishlistMessageIsShown(String message){assertEquals(message, homePage.getWishlistSuccess());}
}
