package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrack.pages.*;
import org.fasttrack.utils.EnvConstants;

public class BaseSteps extends ScenarioSteps {

    public BasePage basePage;
    public LoginPage loginPage;
    public SearchPage searchPage;
    public CartPage cartPage;
    public LogoutPage logoutPage;
    public RegisterPage registerPage;

    @Step
    public void navigateToHomePage(){
        basePage.open();
    }

    @Step
    public void checkHomePage() {
        basePage.checkHomePage();
    }

}
