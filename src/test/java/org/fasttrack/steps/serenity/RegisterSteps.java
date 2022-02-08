package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps{

    @Step
    public void setEmailField(){
        registerPage.setEmailField();
    }

    @Step
    public void setPasswordField(String pass){
        registerPage.setPasswordField(pass);
    }
   @Step
    public void clickOnRegisterButton(){
        registerPage.clickOnRegister();
    }

    @Step
    public void checkLoggedIn(){
        registerPage.checkLoggedIn();
    }

    @Step
    public void appearRegisterErrorMessage(){
        registerPage.appearRegisterErrorMessage();
    }
}
