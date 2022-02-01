package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultsPage extends BasePage {

    @FindBy(css = "[rel='bookmark']")
    private WebElementFacade myProduct;
//
//    @FindBy(css = "[rel='bookmark']")
//    private WebElementFacade mySecondProduct;

    public boolean openProduct(String productName){
       waitFor(myProduct);
       if (myProduct.getText().equalsIgnoreCase(productName)){
           clickOn(myProduct);
           return true;
       }
       return false;
    }

//    public boolean openSecondProduct(String otherProductName){
//        waitFor(mySecondProduct);
//        if (mySecondProduct.getText().equalsIgnoreCase(otherProductName)){
//            clickOn(mySecondProduct);
//            return true;
//        }
//        return false;
//    }
}
