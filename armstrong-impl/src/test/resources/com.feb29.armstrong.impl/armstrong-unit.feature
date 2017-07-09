# Copyright 2017 Feb29 Company. All rights reserved.

Feature: Armstrong Validation Service Units
  # An Armstrong number is a 3-digit number for which the sum of the cube of its digits is equal to the number.

  Scenario Outline: A non 3-digit integer is submitted for Armstrong validation
    Given Armstrong validator
    When Armstrong validation is invoked with integer <number>
    Then Armstrong validation returns false

    Examples:
      | number |
      | 77     |
      | 1000   |
      | 0      |


  Scenario Outline: A 3-digit non-Armstrong integer is submitted for Armstrong validation
    Given Armstrong validator
    When Armstrong validation is invoked with integer <number>
    Then Armstrong validation returns <status>

    Examples:
      | number | status |
      | 222    | false  |
      | 111    | false  |
      | 853    | false  |
      | 370    | true   |
      | 732    | false  |
      | 153    | true   |

