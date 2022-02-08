package org.fasttrack.features.search;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentialsTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        loginSteps.clickOnLoginButton();
        loginSteps.checkUserIsLoggedIn(EnvConstants.USER_NAME);
    }

    @Test
    public void loginWithInvalidCredentialsTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.WRONG_USER_EMAIL, EnvConstants.USER_PASS);
        loginSteps.clickOnLoginButton();
        loginSteps.appearLoginErrorMessage(EnvConstants.ERROR_MESSAGE);
    }

    @Test
    public void loginWithBlankFieldsTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.clickOnLoginButton();
        loginSteps.appearLoginErrorMessage(EnvConstants.LOGIN_ERROR_MESSAGE);
    }
}
