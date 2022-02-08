package org.fasttrack.features.search;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct(EnvConstants.PRODUCT_NAME);
        cartSteps.clickAddProductToCart();
    }

    @Test
    public void emptyCartTest(){
        searchSteps.searchAndSelectProduct(EnvConstants.PRODUCT_NAME);
        cartSteps.clickAddProductToCart();
        cartSteps.navigateToCart();
        cartSteps.clearCart();
    }

    @Test
    public void addToCartAndGoToCheckoutTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct(EnvConstants.PRODUCT_NAME);
        cartSteps.clickAddProductToCart();
        cartSteps.navigateToCart();
        cartSteps.clickProceedToCheckoutButton();
    }
}
