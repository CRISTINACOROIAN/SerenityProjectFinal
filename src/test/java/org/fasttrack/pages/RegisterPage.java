package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang.RandomStringUtils;

public class RegisterPage extends BasePage{
    @FindBy(css=".woocommerce-FormRow.form-row .woocommerce-Button.button")
    private WebElementFacade registerButton;

    @FindBy(id = "reg_email")
    private WebElementFacade emailField;

    @FindBy(id = "reg_password")
    private WebElementFacade passwordField;

    @FindBy(css=".entry-title")
    private WebElementFacade myAccount;

    @FindBy(css = "strong")
    private WebElementFacade registerErrorMessage;

    public void clickOnRegister(){
        clickOn(registerButton);
    }

    public void setEmailField(){
        waitFor(emailField);
        String randomEmail = RandomStringUtils.random(8, "abcdefgh");
        String email = randomEmail + "@abc.com";
        typeInto(emailField, email);
    }

    public void setPasswordField(String pass){
        typeInto(passwordField, pass);
    }

    public void checkLoggedIn(){
        myAccount.shouldContainOnlyText("MY ACCOUNT");
    }

    public void appearRegisterErrorMessage(){
        registerErrorMessage.shouldContainOnlyText("Error:");
    }
}
