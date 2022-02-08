package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;

public class LoginSteps extends BaseSteps {

    @Step
    public void setEmailField(String mail){
        loginPage.setEmailField(mail);
    }

    @Step
    public void setPasswordField(String pass){
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickOnLoginButton(){
        loginPage.clickOnLoginButton();
    }

    @Step
    public void checkUserIsLoggedIn(String userName){
        loginPage.checkUserLoggedIn(userName);
    }

    @Step
    public void appearLoginErrorMessage(String error){
        loginPage.appearLoginErrorMessage(error);
    }

    @Step
    public void doLogin(String userEmail, String userPass) {
        navigateToLoginPage();
        enterCredentials(userEmail, userPass);
        clickOnLoginButton();
    }

    public void enterCredentials(String userEmail, String userPass) {
        setEmailField(userEmail);
        setPasswordField(userPass);
    }

    public void navigateToLoginPage() {
        loginPage.open();
    }
}
