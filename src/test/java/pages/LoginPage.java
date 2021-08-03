package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@class='_3EPGRv84L9Ksb6htRM_xsS']")
    public WebElement welcomeBackHeader;

    @FindBy(xpath = "//h3[@class='_1JdggY66EFijRLpduB_wZG']")
    public WebElement signIntoYourAccountHeader;

    @FindBy(xpath = "//title")
    public WebElement titleAfterYouSignIn;

    //---NEED HELP FINDING "Don't have an account?" LOCATOR

    @FindBy(xpath = "//input[@data-automation-id='email-field']")
    public WebElement emailInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//a[text()='Forgot password?']")
    public WebElement forgetPasswordLink;

    @FindBy(id = "google-signin-button")
    public WebElement signInWithGoogleButton;

    @FindBy(xpath = "//button[@data-automation-id='button']")
    public WebElement continueButton;

    @FindBy(xpath = "//a[@class='Link _291g2aF4hfA0TG1L1tmKiS']")
    public WebElement signUpLink;

    @FindBy(xpath = "//div[text()='Get Started With Notarize']")
    public WebElement getStartedWithNotarizeHeader;

    @FindBy(xpath = "//button[@data-automation-id='button']")
    public WebElement sendPasswordResetLinkButton;

    @FindBy(id = "field-error-message-id-email")
    public WebElement emailIsRequiredMessage;

    @FindBy(xpath = "//div[@class='_2uv01_jDd-YHOoHc-CQF7a FormGroupErrors']")
    public WebElement emailAppearsToBeInvalidMessage;

    @FindBy(xpath = "//p[@class='_2tb3vp5uEt7R6ZimSOFqlx']")
    public WebElement emailOrPasswordInvalidMessage;

    @FindBy(xpath = "//a[@class='Link _291g2aF4hfA0TG1L1tmKiS']")
    public WebElement backLink;



    //Illustration Modal Elements
    @FindBy(xpath = "//div[@data-automation-id='illustration-modal-container']")
    public WebElement illustrationModal;

    @FindBy(xpath = "//i[@data-automation-id='illustration-modal-close']")
    public WebElement illustrationModalExitButton;

    @FindBy(xpath = "//button[@data-automation-id='cosigner-not-required']")
    public WebElement illustrationModalSkipButton;

    @FindBy(xpath = "//button[@data-automation-id='cosigner-is-required']")
    public WebElement illustrationModalAddSecondSignerButton;

    @FindBy(id = "firstName")
    public WebElement illustrationModalFirstNameInputBox;

    @FindBy(id = "lastName")
    public WebElement illustrationModalLastNameInputBox;

    @FindBy(xpath = "//button[@data-automation-id='confirm-signer']")
    public WebElement illustrationModalConfirmButton;

}

