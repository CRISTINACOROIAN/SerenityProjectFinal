package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends BasePage {

    @FindBy(css = "[rel='bookmark']")
    private WebElementFacade myProduct;

    @FindBy(css = ".icon-search")
    private WebElementFacade searchButton;

    @FindBy(css= "[type='submit'] .icon-search")
    private WebElementFacade searchIcon;

    @FindBy(css = "input")
    private  WebElementFacade searchField;

    public void setSearchField(String value){
        typeInto(searchField,value);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }

    public void clickSearchIcon(){
        clickOn(searchIcon);
    }

    public boolean openProduct(String productName){
       waitFor(myProduct);
       if (myProduct.getText().equalsIgnoreCase(productName)){
           clickOn(myProduct);
           return true;
       }
       return false;
    }
}
