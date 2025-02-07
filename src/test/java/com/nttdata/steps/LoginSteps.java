package com.nttdata.steps;

import com.nttdata.screens.CartScreen;
import com.nttdata.screens.MainScreen;
import com.nttdata.screens.ProductScreen;
import org.junit.Assert;

public class LoginSteps {

    MainScreen mainScreen;
    ProductScreen productScreen;
    CartScreen cartScreen;

    public void validateLoginDisplayed(){
        Assert.assertTrue(mainScreen.titleVisible());
    }

    public void validateProductDisplayed(){
        Assert.assertTrue(mainScreen.productVisible());
    }

    public void addToCart(int unit){
        productScreen.clickProduct();
        productScreen.enterUnits(unit);
        productScreen.clickAddProduct();
        productScreen.clickViewCart();
        String unitsText = productScreen.getUnitText();

        System.out.println("Texto capturado desde producto: " + unitsText);
    }

    public void validateUpdateCart(){
        String productText = productScreen.getUnitText(); // El texto capturado del producto
        String cartText = cartScreen.getUnitsText(); // El texto capturado del carrito

        // Imprime los textos capturados
        System.out.println("Texto capturado desde producto: " + productText);
        System.out.println("Texto capturado desde carrito: " + cartText);

        // Validación de que los textos coincidan
        if (productText.equals(cartText)) {
            System.out.println("Las cantidades coinciden: " + productText);
        } else {
            System.out.println("Las cantidades no coinciden. Producto: " + productText + " Carrito: " + cartText);
        }
    }

    public void login(String username,String password){

        mainScreen.enterUser(username);
        mainScreen.enterPassword(password);
        mainScreen.clickLogin();
    }

    public void loginSuccess(){
        Assert.assertTrue(productScreen.isProductDisplayed());
    }
}
