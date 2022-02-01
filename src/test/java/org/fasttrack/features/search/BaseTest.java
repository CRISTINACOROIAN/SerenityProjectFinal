package org.fasttrack.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.serenity.CartSteps;
import org.fasttrack.steps.serenity.LoginSteps;
import org.fasttrack.steps.serenity.SearchSteps;
import org.fasttrack.utils.EnvConstants;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


    @RunWith(SerenityRunner.class)
    public class BaseTest {

        @Managed(uniqueSession = true)
        private WebDriver driver;

        @Before
        public void maximise(){
            driver.manage().window().maximize();
            driver.get(EnvConstants.BASE_URL);
        }

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected CartSteps cartSteps;



}
