package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginStepsDef {
    @Steps
    LoginSteps loginSteps;

@Given("estoy en la aplicación de SauceLabs")
public void estoy_en_la_aplicación_de_sauce_labs() {
    loginSteps.validateLoginDisplayed();
}
    @And("valido que carguen correctamente los productos en la galeria")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria() {
        loginSteps.validateProductDisplayed();
    }
    @When("agrego del siguiente producto y {int} unidades")
    public void agrego_del_siguiente_producto(int units){
          loginSteps.addToCart(units);


    }
    @Then("valido el carrito de compra actualice correctamente")
    public void valido_el_carrito_de_compra_actualice_correctamente() throws InterruptedException {
        loginSteps.validateUpdateCart();
        Thread.sleep(10000);
    }
}
