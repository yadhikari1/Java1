
Feature: Register user

  Scenario: Registration with valid credientials
    Given user in register page with url "https://demo.nopcommerce.com/register?returnUrl=%2F"
    When user chose male
    And user enter first name "yogendra"
    And user enter last  name "adhikari"
    And chose date of birth 
    And enter E-meil address "yoges@gmail.com"
    And company name  "amazon"
    And select newsletter checkbox
    And enter password "Test@123"
    And enter conform password "Test@123"
    Then user should be register(your registeration completed)
    

  