package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;

public class CartSteps extends BaseSteps {

    @Step
    public void clickAddProductToCart(){
        cartPage.clickAddToCartButton();
    }

    @Step
    public void navigateToCart() {
        cartPage.clickOnViewCart();
    }

    @Step
    public void clearCart(){
        cartPage.clearCart();
    }

    @Step
    public void clickProceedToCheckoutButton(){
        cartPage.proceedToCheckoutButton();
    }

}
