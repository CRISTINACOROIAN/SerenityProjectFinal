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

//    @Test
//    public void checkCartTotalSummaryTest(){
//        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
//        cartSteps.navigateToCart();
//        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
//        cartSteps.checkGrandTotalPriceIsCorrect();
//    }
    @Test
    public void emptyCartTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        cartSteps.navigateToCart();
        cartSteps.clearCart();
    }


    @Test
    public void addToCartAndProceedTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct(EnvConstants.PRODUCT_NAME);
        cartSteps.clickAddProductToCart();
        cartSteps.clickViewCartButton();
        cartSteps.clickProceedToCheckoutButton();

    }

    @Test
    public void addToCartProductsAndUpdateCart(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct(EnvConstants.PRODUCT_NAME);
        cartSteps.clickAddProductToCart();
        searchSteps.searchAndSelectProduct(EnvConstants.OTHER_PRODUCT_NAME);
        cartSteps.clickAddProductToCart();
        cartSteps.clickViewCartButton();
        cartSteps.clickUpdateCartButton();

    }
}
