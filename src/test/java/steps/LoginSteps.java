package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.WaitUtils;

public class LoginSteps {
    WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);


    @Given("^user is on \"([^\"]*)\"$")
    public void user_is_on(String url) {
        driver.get(url);
        WaitUtils.waitUrl(driver, url);
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @Then("^page title should be displayed as \"([^\"]*)\"$")
    public void page_title_should_be_displayed_as(String loginPageTitle) {
        WaitUtils.waitForPageTitle(driver, loginPageTitle);
        Assert.assertEquals(loginPageTitle, driver.getTitle());
    }

    @Then("^user should see \"([^\"]*)\" header$")
    public void user_should_see_header(String header) {
        switch (header){
            case "Welcome back!":
                WaitUtils.waitForElementVisible(driver, loginPage.welcomeBackHeader);
                Assert.assertEquals(header, loginPage.welcomeBackHeader.getText());
                break;
            case "Sign into your signer account":
                WaitUtils.waitForElementVisible(driver, loginPage.signIntoYourAccountHeader);
                Assert.assertEquals(header, loginPage.signIntoYourAccountHeader.getText());
                break;
            case "Get Started With Notarize":
                WaitUtils.waitForElementVisible(driver, loginPage.getStartedWithNotarizeHeader);
                Assert.assertEquals(header, loginPage.getStartedWithNotarizeHeader.getText());
                break;
            default:
                throw new NotFoundException("The header specified not found: " + header);
        }
    }

    @Then("^user should see email address input box$")
    public void user_should_see_email_address_input_box() {
        WaitUtils.waitForElementVisible(driver, loginPage.emailInputBox);
        Assert.assertTrue(loginPage.emailInputBox.isDisplayed());
    }

    @Then("^user should see \"([^\"]*)\" button$")
    public void user_should_see_button(String button) {
        switch (button) {
            case "Continue":
                WaitUtils.waitForElementVisible(driver, loginPage.continueButton);
                Assert.assertTrue(loginPage.continueButton.isDisplayed());
                Assert.assertEquals(button, loginPage.continueButton.getText());
                break;
            case "Sign In With Google":
                WaitUtils.waitForElementVisible(driver, loginPage.signInWithGoogleButton);
                Assert.assertTrue(loginPage.signInWithGoogleButton.isDisplayed());
                Assert.assertEquals(button, loginPage.signInWithGoogleButton.getText());
                break;
            case "Send Password Reset Link":
                WaitUtils.waitForElementVisible(driver, loginPage.sendPasswordResetLinkButton);
                Assert.assertTrue(loginPage.sendPasswordResetLinkButton.isDisplayed());
                Assert.assertEquals(button, loginPage.sendPasswordResetLinkButton.getText());
                break;
            default:
                throw new NotFoundException("The button specified could not be found: " + button);
        }
        WaitUtils.waitForElementVisible(driver, loginPage.signUpLink);
        Assert.assertTrue(loginPage.signUpLink.isDisplayed());
    }

    @Then("^user should see \"([^\"]*)\" link$")
    public void user_should_see_link(String link) {
        switch (link) {
            case "Sign up":
                WaitUtils.waitForElementVisible(driver, loginPage.signUpLink);
                Assert.assertTrue(loginPage.signUpLink.isDisplayed());
                Assert.assertEquals(link, loginPage.signUpLink.getText());
                break;
            case "Back":
                WaitUtils.waitForElementVisible(driver, loginPage.backLink);
                Assert.assertTrue(loginPage.backLink.isDisplayed());
                Assert.assertEquals(link, loginPage.backLink.getText());
            default:
                throw new NotFoundException("The link specified could not be found: " + link);
        }
    }

    @When("^user types \"([^\"]*)\" to \"([^\"]*)\" input box$")
    public void user_types_to_input_box(String input, String inputBox){
        switch (inputBox){
            case "email":
                loginPage.emailInputBox.sendKeys(input);
                break;
            case "password":
                try{
                    loginPage.passwordInputBox.sendKeys(Keys.TAB);
                    loginPage.passwordInputBox.sendKeys(input);
                    Assert.assertEquals(input, loginPage.passwordInputBox.getAttribute("value"));
                }
                catch (Exception e){
                    e.printStackTrace();
                    loginPage.passwordInputBox.sendKeys(Keys.TAB);
                    loginPage.passwordInputBox.sendKeys(input);
                    Assert.assertEquals(input, loginPage.passwordInputBox.getAttribute("value"));
                }
                break;
            default:
                throw new NotFoundException("The input box specified not found: " + inputBox);
        }
    }

    @When("^user clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_button(String button) {
        WaitUtils.waitForElementClickable(driver, loginPage.continueButton);
        switch (button) {
            case "Continue":
                loginPage.continueButton.click();
                break;
            case "Sign In With Google":
                loginPage.signInWithGoogleButton.click();
                break;
            case "Send Password Reset Link":
                loginPage.sendPasswordResetLinkButton.click();
                break;
            default:
                throw new NotFoundException("The button specified could not be found: " + button);
        }
    }

    @Then("^page title should be updated to \"([^\"]*)\"$")
    public void page_title_should_be_updated_to(String title){
       WaitUtils.waitForPageTitle(driver, title);
        Assert.assertEquals(title, driver.getTitle());
    }

    @When("^user activates email input box$")
    public void user_activates_email_input_box() {
        WaitUtils.waitForElementClickable(driver, loginPage.emailInputBox);
        loginPage.emailInputBox.click();
    }

    @When("^user leaves input box without providing any information$")
    public void user_leaves_input_box_without_providing_any_information() {
        loginPage.emailInputBox.sendKeys(Keys.TAB);
    }

    @Then("^\"([^\"]*)\" message should be displayed$")
    public void message_should_be_displayed(String message){
        switch (message){
            case "Email Is Required":
                WaitUtils.waitForElementVisible(driver, loginPage.emailIsRequiredMessage);
                Assert.assertEquals(message, loginPage.emailIsRequiredMessage.getText());
                break;
            case "Email Appears To Be Invalid":
                WaitUtils.waitForElementVisible(driver, loginPage.emailAppearsToBeInvalidMessage);
                Assert.assertEquals(message, loginPage.emailAppearsToBeInvalidMessage.getText());
                break;
            case "* Email or password invalid":
                WaitUtils.waitForElementVisible(driver, loginPage.emailOrPasswordInvalidMessage);
                Assert.assertEquals(message, loginPage.emailOrPasswordInvalidMessage.getText());
                break;
            default:
                throw new NotFoundException("The message specified could not be found: " + message);
        }
    }

    @When("^user deletes a portion of the email and leaves input box$")
    public void user_deletes_a_portion_of_the_email_and_leaves_input_box(){
        WaitUtils.waitForElementVisible(driver, loginPage.emailInputBox);
        loginPage.emailInputBox.sendKeys("@" + Keys.TAB);
    }

    @When("^user clicks \"([^\"]*)\" button on the illustration modal if displayed$")
    public void user_clicks_button_on_the_illustration_modal_if_displayed(String button) {
        try{
            if(loginPage.illustrationModal.isDisplayed()){
                switch (button) {
                    case "Confirm":
                        loginPage.illustrationModalConfirmButton.click();
                        break;
                    case "Exit":
                        loginPage.illustrationModalExitButton.click();
                        break;
                    case "Skip":
                        loginPage.illustrationModalSkipButton.click();
                        break;
                    case "Add Second Signer":
                        loginPage.illustrationModalAddSecondSignerButton.click();
                        break;
                    default:
                        throw new NotFoundException("The button specified could not be found: " + button);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("^user clicks on \"([^\"]*)\" link$")
    public void userClicksOnLink(String link){
        switch (link){
            case "Sign up":
                loginPage.signUpLink.click();
                break;
            case "Forgot password?":
                loginPage.forgetPasswordLink.click();
                break;
            case "Back":
                loginPage.backLink.click();
                break;
            default:
                throw new NotFoundException("The link specified could not be found: " + link);
        }
    }
}
