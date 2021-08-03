$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/LoginPage.feature");
formatter.feature({
  "name": "Notarize Login Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"https://app.notarize.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "page title should be displayed as \"Notarize | Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.page_title_should_be_displayed_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Welcome back!\" header",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_see_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Sign into your signer account\" header",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_see_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see email address input box",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_see_email_address_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Continue\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_see_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Sign up\" link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_see_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Sign In With Google\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_see_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"https://app.notarize.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate successful login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user types \"dechols87@gmail.com\" to \"email\" input box",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_types_to_input_box(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Continue\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"Justapassword123!\" to \"password\" input box",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_types_to_input_box(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Continue\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \"Confirm\" button on the illustration modal if displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_button_on_the_illustration_modal_if_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \"Skip\" button on the illustration modal if displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_button_on_the_illustration_modal_if_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be updated to \"Prepare Documents - Notarize\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.page_title_should_be_updated_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"https://app.notarize.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Email Is Required error message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user activates email input box",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_activates_email_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user leaves input box without providing any information",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_leaves_input_box_without_providing_any_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Email Is Required\" message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.message_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"https://app.notarize.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Email Appears To Be Invalid error message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user types \"dechols87@gmail.com\" to \"email\" input box",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_types_to_input_box(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deletes a portion of the email and leaves input box",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_deletes_a_portion_of_the_email_and_leaves_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Email Appears To Be Invalid\" message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.message_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"https://app.notarize.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Sign up link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user clicks on \"Sign up\" link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userClicksOnLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Get Started With Notarize\" header",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_see_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be updated to \"Pricing | Legally Notarize Your Documents Online. Anytime. Anywhere.\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.page_title_should_be_updated_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"https://app.notarize.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate * Email or password invalid error message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user types \"dechols87@gmail.com\" to \"email\" input box",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_types_to_input_box(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Continue\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"abcd1234\" to \"password\" input box",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_types_to_input_box(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Continue\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"* Email or password invalid\" message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.message_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"https://app.notarize.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Forgot password? link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user types \"dechols87@gmail.com\" to \"email\" input box",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_types_to_input_box(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Continue\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Forgot password?\" link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userClicksOnLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see email address input box",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_see_email_address_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
