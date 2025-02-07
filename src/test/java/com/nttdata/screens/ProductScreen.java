package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ProductScreen extends PageObject {
    private WebDriver driver;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
    private WebElement lblProduct;
    @AndroidFindBy(accessibility = "Increase item quantity")
    private WebElement unitsProducts;
    @AndroidFindBy(accessibility = "Sauce Labs Backpack")
    private WebElement products;
    @AndroidFindBy(accessibility = "Tap to add product to cart")
    private WebElement btnAddToCart;
    @AndroidFindBy(accessibility = "View cart")
    private WebElement btnViewCart;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement txtUnits;




    public boolean isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(lblProduct));
        return lblProduct.isDisplayed();
    }

    public void enterUnits(int units){
        for (int i = 0; i < units-1; i++) {
            unitsProducts.click();
        }
    }

    public void clickProduct(){
        /*WebElement product = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='"+productName+"']"));
        System.out.println(product);*/

        products.click();
    }

    public void clickAddProduct(){

        btnAddToCart.click();
    }
    public void clickViewCart(){

        btnViewCart.click();
    }

    public String getUnitText() {
        return txtUnits.getText();
    }
}
