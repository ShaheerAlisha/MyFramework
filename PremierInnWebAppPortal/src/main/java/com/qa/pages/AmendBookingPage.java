package com.qa.pages;

import java.text.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.DateValidator;
import com.qa.util.Timeout;
import com.qa.util.WriteData;

public class AmendBookingPage extends BasePage {

	// AmendBookingPage element identification
	@FindBy(id = "arrivalDate")
	private WebElement arrivalDateSelect;

	@FindBy(xpath = "//h3[contains(@data-test,'rooms_')]")
	private WebElement roomsAvailabilityNotification;

	@FindBy(xpath = "//div[@data-test='rooms_available_message']")
	private WebElement roomsAvailableMessage;

	@FindBy(xpath = "//div[@data-test='rooms_unavailable_message']")
	private WebElement roomUnavailableMessage;

	private By amendDate;

	public final String title = "Amend Details";

	// Initializing AmendBookingPage WebElements using PageFactory
	public AmendBookingPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions to be performed on AmendBookingPage
	public void changeArrivalDate(String amendedDate) {
		arrivalDateSelect.click();
		String amendDateInput = null;
		if (DateValidator.isValidDate(amendedDate)) {
			try {
				amendDateInput = DateValidator.getDate(amendedDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		amendDateInput = "//table//td[@data-day='" + amendDateInput + "']";
		amendDate = By.xpath(amendDateInput);
		driver.findElement(amendDate).click();
	}

	public void captureRoomAvailableMsg(String bookingRef) {
		String msg = null;
		Timeout.waitTillLoading(1000);
		if (roomsAvailabilityNotification.getAttribute("innerText").contains("Rooms available"))
			msg = roomsAvailableMessage.getAttribute("innerText");
		else
			msg = roomUnavailableMessage.getAttribute("innerText");

		WriteData.writeToCSV(bookingRef, msg);
	}

}
