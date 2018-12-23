Feature: Basic dataframe Load

  Scenario: Read File
    Given the file 23_Time_Cards_Race.CSV
    Then the number of rows is 14153
    And the number of columns is 26
