package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LogoutPage extends BasePage {

    @FindBy(css = ".woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--customer-logout a")
    private WebElementFacade category;

    @FindBy(css = ".u-column1.col-1 h2")
    private WebElementFacade loggedOut;

    public void clickOnLogout(){
        waitFor(category);
        category.click();
    }

    public void verifyLoggedOut(){
        loggedOut.shouldContainOnlyText("Login");
    }
}
