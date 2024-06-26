Feature: Login to Dominos

  Scenario: user the valid credentials
    Given Launch the URL and maximize
    When Click order online button
    Then Locate the delivery address
    Then select vegpizza and add require quantity
    And select beverages and add require quantity
    Then Remove quantity
    Then click checkout
