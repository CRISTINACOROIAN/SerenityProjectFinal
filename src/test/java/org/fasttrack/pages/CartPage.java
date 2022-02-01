package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {


    @FindBy(css = ".product-cart-total .price")
    private  List<WebElementFacade> listOfSubtotalPrices;

    @FindBy(css = "[title='Subtotal']")
    private  WebElementFacade subtotalText;

    @FindBy(css = "[title='Shipping']")
    private  WebElementFacade shippingFeeText;

    @FindBy(css = "[title='Total']")
    private  WebElementFacade grandTotal;

    @FindBy(css=".cart-empty")
    private WebElementFacade clearCart;

    @FindBy(css=".checkout-button.button.alt.wc-forward")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(css=".button.wc-forward")
    private WebElementFacade viewCartButton;

    @FindBy(name="update_cart")
    private WebElementFacade updateCartButton;


    public int getSubtotalPricesCalculated() {
        int sum = 0;
        for (WebElementFacade element : listOfSubtotalPrices) {
            sum += getIntFromPrice(element.getText());
        }
        return sum;
    }

    public boolean isSubtotalPriceCorrect() {
        return getSubtotalPricesCalculated() == getIntFromPrice(subtotalText.getText());
    }

    public int getSubtotalPriceWithTaxes(){
        String x = subtotalText.getText();
        String y = "0";
        if (shippingFeeText.isPresent()){
            y = shippingFeeText.getText();
        }
        return getIntFromPrice(x) + getIntFromPrice(y);
    }

    public boolean isGrandTotalPriceCorrect(){
        return getSubtotalPriceWithTaxes() == getIntFromPrice(grandTotal.getText());
    }

    public void clearCart(){
        clickOn(clearCart);
    }

    public void proceedToCheckoutButton(){
        clickOn(proceedToCheckoutButton);
    }

    public void viewCartButton(){
        clickOn(viewCartButton);
    }

    public void updateCartButton(){
        clickOn(updateCartButton);
    }
}
