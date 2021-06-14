package com.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BrowserConfig;
import com.qa.util.Timeout;
import com.qa.util.WriteData;

public class AmendBookingPage extends BrowserConfig {

	//Initializing AmendBookingPage WebElements using PageFactory
	public AmendBookingPage() {
		PageFactory.initElements(driver, this);
	}

	//AmendBookingPage element identification
	@FindBy(id = "arrivalDate")
	private WebElement arrivalDateSelect;

	@FindBy(xpath = "//h3[contains(@data-test,'rooms_')]")
	private WebElement roomsAvailabilityNotification;

	@FindBy(xpath = "//div[@data-test='rooms_available_message']")
	private WebElement roomsAvailableMessage;

	@FindBy(xpath = "//div[@data-test='rooms_unavailable_message']")
	private WebElement roomUnavailableMessage;

	public final String title = "Amend Details";

	// Actions to be performed on AmendBookingPage
	public String getPageTitle() {
		return driver.getTitle();
	}

	public void changeArrivalDate() {
		arrivalDateSelect.click();
		arrivalDateSelect.sendKeys(Keys.ARROW_LEFT);
	}

	public void captureRoomAvailableMsg(String bookingRef) {
		String msg = null;
		if (roomsAvailabilityNotification.getAttribute("innerText").contains("Rooms available"))
			msg = roomsAvailableMessage.getAttribute("innerText");
		else
			msg = roomUnavailableMessage.getAttribute("innerText");

		WriteData.writeToCSV(bookingRef, msg);
	}

}
