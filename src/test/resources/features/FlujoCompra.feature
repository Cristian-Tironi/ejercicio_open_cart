@FlujoCompra
Feature: Compra de productos en opencart.abstracta
  Como tester quiero ingresar a la URL de opencart.abstracta,
  agregar dos productos al carrito, visualizarlo,
  completar el checkout como invitado, finalizar la compra
  y visualizar la confirmación.

  @01-Compra
  Scenario Outline: Validar que como invitado puedo realizar una compra

    Given usuario ingreso a la URL de opencart abstracta
    When agrega <cntProductos> al carrito
    And visualiza el carrito
    And completar el checkout como invitado
      | FirstName | LastName | Email             | Telefono  | Company | Address     | City   | PostCode | Country | Region |
      | Cristian  | Tironi   | correo@correo.com | 091234567 | Empresa | Av. Address | Rivera | 12345    | Uruguay | Rivera |
    Then  finaliza la compra
    And visualizo la confirmación: "<validacion>"
    Examples:
      | cntProductos | validacion                  |
      | 2            | Your order has been placed! |