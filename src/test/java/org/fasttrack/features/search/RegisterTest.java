package org.fasttrack.features.search;

import org.junit.Test;
import org.fasttrack.utils.EnvConstants;
public class RegisterTest extends BaseTest{

    @Test
    public void registerWithValidCredentials(){
        loginSteps.navigateToLoginPage();
        registerSteps.setEmailField();
        registerSteps.setPasswordField(EnvConstants.USER_PASS);
        registerSteps.clickOnRegisterButton();
        registerSteps.checkLoggedIn();
    }

    @Test
    public void registerWithBlankFields(){
        loginSteps.navigateToLoginPage();
        registerSteps.clickOnRegisterButton();
        registerSteps.appearRegisterErrorMessage();
    }
}
