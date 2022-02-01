package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrack.pages.*;
import org.fasttrack.utils.EnvConstants;

public class BaseSteps extends ScenarioSteps {

    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public SearchResultsPage searchResultsPage;
    public CartPage cartPage;
    public ProductPage productPage;

    @Step
    public void navigateToAdminHomePage(){
        getDriver().get(EnvConstants.ADMIN_BASE_URL);
    }

    @Step
    public void navigateToHomePage(){
        getDriver().get(EnvConstants.BASE_URL);

    }

}
