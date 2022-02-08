package org.fasttrack.steps.serenity;


import net.thucydides.core.annotations.Step;

public class LogoutSteps extends BaseSteps {
    @Step
    public void logout(){
        logoutPage.clickOnLogout();
    }

    @Step
    public void verifyLoggedOut(){
        logoutPage.verifyLoggedOut();
    }

}
