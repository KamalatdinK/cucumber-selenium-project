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

    @FindBy(className = "input et_pb_contact_captcha")
    WebElement inputCaptcha;

    public static final Map<String, By> navigationButtons = Map.of(
            "FilloutForms", By.cssSelector("#post-507 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_3_4.et_pb_column_0.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough > div > div > div > div > ul > li:nth-child(4) > a")
    );

    public static final Map<String, By> textFields = Map.of(
            "name1", By.id("et_pb_contact_name_0"),
            "message1", By.id("et_pb_contact_message_0"),
            "name2", By.id("et_pb_contact_name_1"),
            "message2", By.id("et_pb_contact_message_1")
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
    public void solveCaptcha(){
        String captchaQuestion = captchaQuestionElement.getText();
        String[] numbers = captchaQuestion.split("\\s+");
        int firstNumber = Integer.parseInt(numbers[0]);
        int secondNumber = Integer.parseInt(numbers[2]);
        int sum = firstNumber + secondNumber;
        inputCaptcha.sendKeys(String.valueOf(sum));
    }

}
