package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {

    @Step
    public void executeSearch(String keyword){
        searchPage.clickSearchButton();
        searchPage.setSearchField(keyword);
        searchPage.clickSearchIcon();
    }

    @Step
    public void findAndOpenProduct(String productName){
        Assert.assertTrue(searchPage.openProduct(productName));
    }

    @Step
    public void searchAndSelectProduct(String productName){
       executeSearch(productName);
       findAndOpenProduct(productName);
    }
}
