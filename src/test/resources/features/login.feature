@login
Feature: Validar carrito

  @login_success
  Scenario: Validar funcionalidad carrito de compras

    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego del siguiente producto y 4 unidades
    Then valido el carrito de compra actualice correctamente