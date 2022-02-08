package org.fasttrack.features.search;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchTest(){
        searchSteps.executeSearch(EnvConstants.PRODUCT_NAME);
    }

    @Test
    public void findProductFromSearch(){
        searchSteps.searchAndSelectProduct(EnvConstants.PRODUCT_NAME);
    }
}
