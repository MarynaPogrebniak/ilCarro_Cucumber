package com.ilCarro.stepDefinitions;

import com.ilCarro.pages.RentCarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import static com.ilCarro.pages.BasePage.driver;

public class RentCarSteps {

    @And("User clicks on Let the car work link")
    public void click_on_Let_the_car_work_link() {
        new RentCarPage(driver).clickOnLetTheCarWorkLink();
    }

    @And("User enters valid data about a car")
    public void enter_valid_data_about_a_car() {
        new RentCarPage(driver).enterDataAboutACar();
    }

    @And("User clicks on submit button")
    public void click_on_submit_button() {
        new RentCarPage(driver).submit();
    }

    @Then("User verifies message, that a car was added")
    public void verify_message_that_a_car_was_added() {
        new RentCarPage(driver).submitMessageCarWasAdded("Car added");
    }
}
