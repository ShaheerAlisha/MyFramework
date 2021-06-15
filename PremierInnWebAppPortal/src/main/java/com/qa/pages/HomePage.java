package com.qa.pages;

import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.DateValidator;
import com.qa.util.Timeout;

public class HomePage extends BasePage {


	//HomePage element identification
	@FindBy(how = How.ID, using = "find-a-booking")
	@CacheLookup
	private WebElement manageBooking;

	@FindBy(id = "booking-reference-input")
	private WebElement bookingReferenceInput;

	@FindBy(id = "booking-surname-input")
	private WebElement lastName;

	@FindBy(xpath = "//drop-down-group[contains(@class,'find-booking-date-picker')]//input")
	private WebElement arrivalDateElement;

	@FindBy(id = "find-booking-form-button")
	private WebElement searchButton;

	private By arrivalDatePicker;
	public final String title = "Premier Inn hotels | Book direct";
	
	//Initializing HomePage WebElements using PageFactory
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions to be performed on HomePage
	public void selectManageBooking() {
		manageBooking.click();
	}

	public void enterBookingReference(String refID) {
		bookingReferenceInput.sendKeys(refID);
	}

	public void enterLastName(String name) {
		lastName.sendKeys(name);
	}

	public void enterArrivalDate(String arrivalDate) throws ParseException {
		String arrivalDateInput = null;
		arrivalDateElement.click();

		if (DateValidator.isValidDate(arrivalDate))
			arrivalDateInput = DateValidator.covertDateFormat(arrivalDate);
		arrivalDateInput = "date-picker-day-" + arrivalDateInput;
		arrivalDatePicker = By.id(arrivalDateInput);
		driver.findElement(arrivalDatePicker).click();
	}

	public BookingInfoPage searchBooking() {

		searchButton.click();
		Timeout.waitTillLoading(3000);
		return new BookingInfoPage(); //return Booking Information page object
	}

}
