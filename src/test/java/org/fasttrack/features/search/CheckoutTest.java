package org.fasttrack.features.search;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void validCheckout(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct(EnvConstants.PRODUCT_NAME);
        cartSteps.clickAddProductToCart();
    }


}
