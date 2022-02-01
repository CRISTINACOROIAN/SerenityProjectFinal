package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {
    @FindBy(css = ".icon-search")
    private WebElementFacade searchButton;

    @FindBy(css= "[type='submit'] .icon-search")
    private WebElementFacade searchIcon;

    @FindBy(css = ".skip-account .label")
    private  WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private  WebElementFacade loginLink;

    @FindBy(css = "input")
    private  WebElementFacade searchField;

    @FindBy(css = ".icon-search")
    private  WebElementFacade cartIcon;

    @FindBy(css = ".cart-control")
    private  WebElementFacade viewShoppingCartLink;

    @FindBy(css = ".widget-title")
    private WebElementFacade RecentCommentsButton;


    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String value){
        typeInto(searchField,value);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }


    public void clickSearchIcon(){
        clickOn(searchIcon);
    }
   public void clickOnCartIcon() {
       clickOn(cartIcon);
    }

   public void clickOnViewShoppingCartLink() {
      waitFor(viewShoppingCartLink);
       clickOn(viewShoppingCartLink);
   }

   public void clickOnRecentCommentsButton(){
        clickOn(RecentCommentsButton);
   }
}
