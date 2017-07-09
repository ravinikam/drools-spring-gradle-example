# Copyright 2017 Feb29 Company. All rights reserved.

Feature: Provide a service that determines if a number is an Armstrong number
  An Armstrong number is a 3-digit number for which the sum of the cube of each of its digits is equal to the number.

  Scenario Outline: A non 3-digit integer that is submitted for Armstrong validation shall always return false.
    When isArmstrong is invoked with integer <number> via REST
    Then the HTTP response contains false

    Examples:
      | number |
      | 77     |
      | 1000   |
      | 0      |

  Scenario Outline: A 3-digit integer that is submitted for Armstrong validation shall return true if the sum of the
  cube of each of its digits is equal to the number, otherwise validation shall return false.
    When isArmstrong is invoked with integer <number> via REST
    Then the HTTP response contains <status>

    Examples:
      | number | status |
      | 222    | false  |
      | 111    | false  |
      | 853    | false  |
      | 370    | true   |
      | 732    | false  |
      | 153    | true   |

  Scenario: The user shall have access to the swagger API documentation.
    Given Swagger API ui is available at swagger-ui.html
    When user invokes api context via HTTP GET
    Then client is redirected to swagger ui
