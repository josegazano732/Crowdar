@Smoke
Feature: Como usuario de la plataforma necesito registrame para acceder a pagina de inicio

  Background:
    Given El cliente se encuentra en la seccion de registro

  Scenario Outline: El cliente se registra con Email y Password de forma exitosa.
    When Ingresa email <email> y password <password>.
    Then Accedemos a pagina principal.

    Examples:
      |email|password|
      |josegazano7@outlook.com|apostoles2022|




