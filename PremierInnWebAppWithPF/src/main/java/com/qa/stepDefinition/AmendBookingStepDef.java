package com.qa.stepDefinition;

import org.junit.Assert;
import com.qa.pages.AmendBookingPage;
import com.qa.pages.BookingInfoPage;
import com.qa.pages.HomePage;
import com.qa.util.BrowserConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmendBookingStepDef extends BrowserConfig {

	// Create Object reference for Pages
	HomePage homePF = new HomePage();
	BookingInfoPage bookingInfoPage;
	AmendBookingPage amendBookingPage;

	// Start of Step Definition Methods
	@Given("user opens homepage")
	public void user_open_web_page_url() {

		String actualTitle = homePF.getPageTitle();
		String expectedTitle = homePF.title;
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@When("user select Manage Booking")
	public void user_select_manage_booking() {
		homePF.selectManageBooking();
	}

	@Then("enter {string},{string}, {string} to search booking")
	public void enter_to_search_booking(String bookingRef, String lastName, String arrivalDate) throws Exception {

		homePF.enterBookingReference(bookingRef);
		homePF.enterLastName(lastName);
		homePF.enterArrivalDate(arrivalDate);
		bookingInfoPage = homePF.searchBooking();

	}

	@Then("verify the booking information {string} and click on Amend Booking")
	public void verify_the_booking_information_and_click_on_amend_booking(String bookingRef)
			throws InterruptedException {

		String actualTitle = bookingInfoPage.getPageTitle();
		String expectedTitle = bookingInfoPage.title;
		Assert.assertEquals(expectedTitle, actualTitle);

		String actualRefID = bookingInfoPage.verifyBookingInfo();
		Assert.assertEquals(bookingRef, actualRefID);
		amendBookingPage = bookingInfoPage.selectAmendBooking();

	}

	@Then("click on arrival date field and change the date")
	public void click_on_arrival_date_field_and_change_the_date() {

		String actualTitle = amendBookingPage.getPageTitle();
		String expectedTitle = amendBookingPage.title;
		Assert.assertEquals(expectedTitle, actualTitle);
		amendBookingPage.changeArrivalDate();

	}

	@Then("capture the Rooms available information in csv file {string}")
	public void capture_the_rooms_available_information_in_csv_file(String bookingRef) {

		amendBookingPage.captureRoomAvailableMsg(bookingRef);
	}

}
