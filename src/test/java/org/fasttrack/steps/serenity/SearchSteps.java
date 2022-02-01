package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {

    @Step
    public void executeSearch(String keyword){
        homePage.clickSearchButton();
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }

    @Step
    public void findAndOpenProduct(String productName){
        Assert.assertTrue(searchResultsPage.openProduct(productName));
    }

//    @Step
//    public void findAndOpenSecondProduct(String otherProductName){
//        Assert.assertTrue(searchResultsPage.openProduct(otherProductName));
//    }

    @Step
    public void searchAndSelectProduct(String productName){
       executeSearch(productName);
       findAndOpenProduct(productName);
    }
}
