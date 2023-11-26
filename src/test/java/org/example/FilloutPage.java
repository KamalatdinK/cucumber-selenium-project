package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class FilloutPage extends AbstractStepDefs {
    @Then("{string} message is shown")
    public void thanksForContactingUsMessageIsShown() {
        homePage.getOutputMessage();
    }

    @Given("the {string} is filled with {string}")
    public void theCaptchaContainerIsFilledWithResult() { homePage.solveCaptcha();
    }
}
