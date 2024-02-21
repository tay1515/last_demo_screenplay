Feature: Login


  Scenario: Inicio de sesion.
    Given Inicio en la pagina
    When intento iniciar sesion con las credenciales
      | user   | password |
      | Jsmith | Demo1234 |