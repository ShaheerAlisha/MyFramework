package com.qa.stepDefinition;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.qa.pages.AmendBookingPage;
import com.qa.pages.BookingInfoPage;
import com.qa.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Contains Step Definition methods for AmendBooking feature
 *
 * @author ShaheerAlisha
 */
public class AmendBookingStepDef {

    // Create Object reference for Pages
    private HomePage homePage = new HomePage();
    private BookingInfoPage bookingInfoPage;
    private AmendBookingPage amendBookingPage;

    //Create object reference for softAssert
    SoftAssert softAssert = new SoftAssert();

    // Private instance variable declaration
    private String actualTitle = null, expectedTitle = null;

    // Start of Step Definition Methods
    @Given("user opens homepage")
    public void user_open_web_page_url() {
        actualTitle = homePage.getPageTitle();
        expectedTitle = homePage.title;
        Assert.assertEquals(expectedTitle, actualTitle); //Hard Assert
    }

    @When("user select Manage Booking")
    public void user_select_manage_booking() {
        homePage.selectManageBooking();
    }

    @Then("enter {string},{string}, {string} to search booking")
    public void enter_to_search_booking(String bookingRef, String lastName, String arrivalDate) {
        homePage.enterBookingReference(bookingRef);
        homePage.enterLastName(lastName);
        homePage.enterArrivalDate(arrivalDate);
        bookingInfoPage = homePage.searchBooking();
    }

    @Then("verify the booking information {string} and click on Amend Booking")
    public void verify_the_booking_information_and_click_on_amend_booking(String bookingRef)
            throws InterruptedException {
        actualTitle = bookingInfoPage.getPageTitle();
        expectedTitle = bookingInfoPage.title;
        softAssert.assertEquals(expectedTitle, actualTitle); //Soft Assert

        String actualRefID = bookingInfoPage.verifyBookingInfo();
        softAssert.assertEquals(bookingRef, actualRefID);
        amendBookingPage = bookingInfoPage.selectAmendBooking();
        softAssert.assertAll();
    }

    @Then("click on arrival date field and change the date {string}")
    public void click_on_arrival_date_field_and_change_the_date(String amendedDate) {
        actualTitle = amendBookingPage.getPageTitle();
        expectedTitle = amendBookingPage.title;
        Assert.assertEquals(expectedTitle, actualTitle);
        amendBookingPage.changeArrivalDate(amendedDate);
    }

    @Then("capture the Rooms available information in csv file {string}")
    public void capture_the_rooms_available_information_in_csv_file(String bookingRef) {
        amendBookingPage.captureRoomAvailableMsg(bookingRef);
    }

}
