# new feature
# Tags: optional

Feature: compra Zonafit
  as
    cliente de zonafit
  i want to
    adquirir la buscar y compra de un producto
  so that
    obtiene el producto

  @oferta
  Scenario: busqueda y compra de dos productos
    Given el cliente desea buscar y seleccionar dos productos
    When el cliente realiza la seleccion y se dirige al carrito
    Then Zonafit realiza la respectivo formulario para la compra

  @ofertaMenorAMayor
  Scenario: busqueda y compra de dos productos de menor a mayor precio
    Given el cliente desea buscar y seleccionar dos productos
    When el cliente realiza la seleccion y se dirige al carrito
    Then Zonafit realiza la respectivo formulario para la compra