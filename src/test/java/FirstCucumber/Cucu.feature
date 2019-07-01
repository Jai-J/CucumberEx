Feature: Test Calculator
  This file describes calculator functionality

  Scenario: Adding two numbers
    Given Enter 50 in the calculator
    And Press add button
    And Enter 50 in the calculator again
   	When press equal button
    Then The result should be 100 on this screen