@Login
Feature: Notarize Login Functionality

  Background:
    Given user is on "https://app.notarize.com/login"

  Scenario: Validate login page
    Then page title should be displayed as "Notarize | Login"
    And user should see "Welcome back!" header
    And user should see "Sign into your signer account" header
    And user should see email address input box
    And user should see "Continue" button
    And user should see "Sign up" link
    And user should see "Sign In With Google" button

  Scenario: Validate successful login with valid credentials
    When user types "dechols87@gmail.com" to "email" input box
    And user clicks on "Continue" button
    And user types "Justapassword123!" to "password" input box
    And user clicks on "Continue" button
    And user clicks "Confirm" button on the illustration modal if displayed
    And user clicks "Skip" button on the illustration modal if displayed
    Then page title should be updated to "Prepare Documents - Notarize"

  Scenario: Validate Email Is Required error message
    When user activates email input box
    And user leaves input box without providing any information
    Then "Email Is Required" message should be displayed

  Scenario: Validate Email Appears To Be Invalid error message
   When user types "dechols87@gmail.com" to "email" input box
    And user deletes a portion of the email and leaves input box
    Then "Email Appears To Be Invalid" message should be displayed

  Scenario: Validate Sign up link
    When user clicks on "Sign up" link
    Then user should see "Get Started With Notarize" header
    And page title should be updated to "Pricing | Legally Notarize Your Documents Online. Anytime. Anywhere."

  Scenario: Validate * Email or password invalid error message
    When user types "dechols87@gmail.com" to "email" input box
    And user clicks on "Continue" button
    And user types "abcd1234" to "password" input box
    And user clicks on "Continue" button
    Then "* Email or password invalid" message should be displayed

  Scenario: Validate Forgot password? link
    When user types "dechols87@gmail.com" to "email" input box
    And user clicks on "Continue" button
    And user clicks on "Forgot password?" link
    Then user should see email address input box

  Scenario: Validate the Back button works properly after clicking Forgot password? link
    When user types "dechols87@gmail.com" to "email" input box
    And user clicks on "Continue" button
    And user clicks on "Forgot password?" link
    When user clicks on "Back" link
    Then page title should be displayed as "Notarize | Login"


