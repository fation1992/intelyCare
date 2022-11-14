Feature: As a user i should be able to create a new account on intelyCare website
  by providing all mandatory data and click continue button

Background: Entering username and password to start creating a new account
  Given i open the page
  And i enter username and password
  And i click create account


  Scenario: Verify that filling all the fields enable the Continue button
    When i fill all the fields with data
    Then continue button is enabled

    Scenario: Clicking continue button sends you to OTP page
      When i fill all the fields with data
      And i click continue Button
      Then i land on OTP page

