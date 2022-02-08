package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends BasePage {

    @FindBy(css=".product-remove .remove")
    private WebElementFacade clearCart;

    @FindBy(css=".checkout-button.button.alt.wc-forward")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(css = ".single_add_to_cart_button.button.alt")
    private WebElementFacade addToCartButton;

    @FindBy(css= ".woocommerce .cart-empty")
    private WebElementFacade emptyCart;

    @FindBy(css=".entry-title")
    private WebElementFacade checkoutPage;

    @FindBy(css=".woocommerce-message .button.wc-forward")
    private WebElementFacade viewCart;


    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
    public void clearCart(){
        waitFor(clearCart);
        clickOn(clearCart);
        checkCartIsEmpty();
    }

    public void checkCartIsEmpty(){
        waitFor(emptyCart);
        emptyCart.shouldContainOnlyText("Your cart is currently empty.");
    }

    public void proceedToCheckoutButton(){
        clickOn(proceedToCheckoutButton);
        verifyCheckoutPage();
    }

    public void verifyCheckoutPage(){
        waitFor(checkoutPage);
        checkoutPage.shouldContainOnlyText("CHECKOUT");
    }

    public void clickOnViewCart(){
        waitFor(viewCart);
        clickOn(viewCart);
    }
}
