package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class BasePage extends PageObject {

    @FindBy(css = "#post-408 .entry-title [rel='bookmark']")
    private WebElementFacade homePage;

    public void checkHomePage() {
        homePage.shouldContainOnlyText("Let’s play");
    }
}
