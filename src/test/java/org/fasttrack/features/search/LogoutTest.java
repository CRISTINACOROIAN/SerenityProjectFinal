package org.fasttrack.features.search;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void logoutTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        loginSteps.clickOnLoginButton();
        logoutSteps.logout();
        logoutSteps.verifyLoggedOut();
    }

}
