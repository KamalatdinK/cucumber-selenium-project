package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.BaseLogEntry;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.Map;

public class HomePage {
    private static final String PAGE_URL = "https://demowebshop.tricentis.com/";
    private final WebDriver driver;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")
    WebElement loginError1;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")
    WebElement loginError2;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement accountName;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span/span")
    WebElement total;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div[2]/div[2]/div")
    WebElement emptyCartMessage;
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/p[2]")
    WebElement emailErrorMessage;
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/span")
    WebElement closeButton;
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/p[1]")
    WebElement nameErrorMessage;
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/p")
    WebElement wishlistSuccess;
    public static final Map<String, By> navigationButtons = Map.ofEntries(
            Map.entry("Login", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")),
            Map.entry("Log in", By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")),
            Map.entry("Log out", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")),
            Map.entry("Register", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")),
            Map.entry("Books", By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")),
            Map.entry("Shopping Cart", By.cssSelector(".ico-cart .cart-label")),
            Map.entry("Appeals and Shoes", By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")),
            Map.entry("RemoveItem1", By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[1]/input")),
            Map.entry("RemoveItem2", By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[2]/td[1]/input")),
            Map.entry("UpdateCart", By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")),
            Map.entry("Gift Cards", By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a")),
            Map.entry("GIFTCARD25LINK", By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/h2/a")),
            Map.entry("RemoveGiftCard25", By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[1]/input")),
            Map.entry("JewelryNavButton", By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[6]/a")),
            Map.entry("Diamond", By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/h2/a")),
            Map.entry("AddToWishlist", By.xpath("//*[@id=\"add-to-wishlist-button-14\"]"))

    );
    public static final Map<String, By> textFields = Map.of(
            "email", By.id("Email"),
            "password", By.id("Password"),
            "RecipientName", By.id("giftcard_2_RecipientName"),
            "RecipientEmail", By.id("giftcard_2_RecipientEmail"),
            "MessageField", By.id("giftcard_2_Message")
    );
    public static final Map<String, By> items = Map.of(
            "Computing and Internet", By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input"),
            "Casual Golf Belt", By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/div[3]/div[2]/input"),
            "AddGift25ToCart", By.xpath("//*[@id=\"add-to-cart-button-2\"]")
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
    public void clickButton(String button){ driver.findElement(navigationButtons.get(button)).click();}
    public String getPageUrl() {
        return driver.getCurrentUrl();
    }
    public String getLoginError1(){
        return loginError1.getText();
    }
    public String getLoginError2(){
        return loginError2.getText();
    }
    public String getAccountName(){ return accountName.getText();}
    public void addItemToCart(String item) { driver.findElement(items.get(item)).click();}
    public String getTotal() { return total.getText();}
    public String getEmptyCartMessage() { return emptyCartMessage.getText();
    }
    public void clickCloseButton(String button){
        if (button=="closeButton"){ driver.findElement((By) closeButton).click();}
    }
    public String getEmailErrorMessage() { return emailErrorMessage.getText();
    }

    public String getNameErrorMessage() {
        return nameErrorMessage.getText();
    }
    public String getWishlistSuccess(){
        return wishlistSuccess.getText();
    }
}
