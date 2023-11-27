package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.Map;

public class HomePage {
    private static final String PAGE_URL = "https://ultimateqa.com/automation";

    private final WebDriver driver;

    @FindBy(className = "et-pb-contact-message")
    WebElement outputMessage;

    @FindBy(className = "et_pb_contact_captcha_question")
    WebElement captchaQuestionElement;

    public static final Map<String, By> navigationButtons = Map.of(
            "FillOutForms", By.cssSelector(".et_pb_text_inner > :nth-child(2) > li:nth-child(4) > a"),
            "submit1", By.cssSelector("#et_pb_contact_form_0 > .et_pb_contact_submit .et_pb_button"),
            "submit2", By.name("et_builder_submit_button")
    );
    //.et_pb_text_inner > :nth-child(2) > li:nth-child(4) > a

    public static final Map<String, By> textFields = Map.of(
            "name1", By.id("et_pb_contact_name_0"),
            "message1", By.id("et_pb_contact_message_0"),
            "name2", By.id("et_pb_contact_name_1"),
            "message2", By.id("et_pb_contact_message_1"),
            "result", By.className("et_pb_contact_captcha")
    );

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void closePage(){
        driver.quit();
    }
    public void openPage(){
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }
    public void fillOutField(String field, String text) {
        driver.findElement(textFields.get(field)).sendKeys(text);
    }
    public void clickButton(String button){driver.findElement(navigationButtons.get(button)).click();}
    public String getPageUrl() {
        return driver.getCurrentUrl();
    }
    public String getOutputMessage(){
        return outputMessage.getText();
    }
    public void fillCaptcha(){ driver.findElement(textFields.get("result")).sendKeys(solveCaptcha());
    }

    public String solveCaptcha(){
        String captchaQuestion = captchaQuestionElement.getText();
        String[] numbers = captchaQuestion.split("\\s+");
        int firstNumber = Integer.parseInt(numbers[0]);
        int secondNumber = Integer.parseInt(numbers[2]);
        int sum = firstNumber + secondNumber;
        return String.valueOf(sum);
    }

}
