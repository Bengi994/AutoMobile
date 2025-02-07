package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class MainScreen extends PageObject {


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement title;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement product;
    @AndroidFindBy(accessibility = "test-Username")
    private WebElement txtUsername;
    @AndroidFindBy(accessibility = "test-Password")
    private WebElement txtPassword;
    @AndroidFindBy(accessibility = "test-LOGIN")
    private WebElement btnLogin;

    public boolean titleVisible(){
        return title.isDisplayed();
    }

    public boolean productVisible(){
        return product.isDisplayed();
    }

    public void enterUser(String user){
        txtUsername.sendKeys(user);
    }

    public void enterPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void clickLogin(){
        btnLogin.click();
    }
}
