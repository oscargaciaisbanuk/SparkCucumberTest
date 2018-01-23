Feature: Basic dataframe Load

  Scenario: Read File
    Given the file /users/oalfonso/Downloads/23_Time_Cards.CSV
    Then the number of columns is 26
    And the number of rows is 12912