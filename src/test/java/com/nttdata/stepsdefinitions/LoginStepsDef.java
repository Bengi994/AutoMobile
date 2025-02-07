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
//
//    @Given("que estoy en la aplicacion de Swag Labs")
//    public void que_estoy_en_la_aplicacion_de_swag_labs() {
//        loginSteps.validateLoginDisplayed();
//    }
//    @When("ingreso mis credenciales username {string} y password {string}")
//    public void ingreso_mis_credenciales_username_y_password(String username, String password) {
//        loginSteps.login(username,password);
//    }
//    @Then("el inicio de sesion es exitoso")
//    public void el_inicio_de_sesion_es_exitoso() {
//        loginSteps.loginSuccess();
//    }
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
        Thread.sleep(30000);
    }
}
