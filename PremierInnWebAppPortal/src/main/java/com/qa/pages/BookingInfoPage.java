package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.Timeout;

public class BookingInfoPage extends BasePage {

    // BookingInfoPage element identification
    @FindBy(xpath = "//h3[@data-test-id='booking-reference']")
    private WebElement bookingReferenceID;

    @FindBy(xpath = "//button[@data-test-id='amend-button']")
    private WebElement amendBookingButton;

    public final String title = "Premier Inn Dashboard";

    // Initializing BookingInfoPage WebElements using PageFactory
    public BookingInfoPage() {
        PageFactory.initElements(driver, this);
    }

    // Actions to be performed on BookingInfoPage
    public String verifyBookingInfo() {
        return bookingReferenceID.getText();
    }

    public AmendBookingPage selectAmendBooking() {
        amendBookingButton.click();
        Timeout.waitTillLoading(3000);
        return new AmendBookingPage();
    }

}