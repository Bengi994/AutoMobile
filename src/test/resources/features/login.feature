@login
Feature: Login Sauce Demo

  @login_success
  Scenario: Login con credenciales validos

    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego del siguiente producto y 2 unidades
    Then valido el carrito de compra actualice correctamente