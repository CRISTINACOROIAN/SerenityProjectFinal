package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class CartSteps extends BaseSteps {


    @Step
    public void clickAddProductToCart(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void navigateToCart() {
        homePage.clickOnCartIcon();
        homePage.clickOnViewShoppingCartLink();
    }

    @Step
    public void clearCart(){
        cartPage.clearCart();
    }


    @Step
    public void clickProceedToCheckoutButton(){
        cartPage.proceedToCheckoutButton();
    }

    @Step
    public void clickViewCartButton(){
        cartPage.viewCartButton();
    }

    @Step
    public void clickUpdateCartButton(){
        cartPage.updateCartButton();
    }

//    @Step
//    public void checkSubtotalPriceIsDisplayedCorrectly(){
//        Assert.assertTrue("The subtotal price is not correct!",cartPage.isSubtotalPriceCorrect());
//    }
//
//    @Step
//    public void checkGrandTotalPriceIsCorrect(){
//        Assert.assertTrue("Total price not correct", cartPage.isGrandTotalPriceCorrect());
//    }
}
