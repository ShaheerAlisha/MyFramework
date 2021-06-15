package com.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.BasePage;

public class Timeout extends BasePage {

    public static void waitImplicit() {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(PropManager.getProp("implicitWaitTimeout")),
                TimeUnit.SECONDS);
    }

    // Method Overloading
    public static void waitImplicit(Long timeInSeconds) {
        driver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
    }

    public static void pageLoadWait() {
        driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(PropManager.getProp("pageLoadTimeout")),
                TimeUnit.SECONDS);
    }

    public static void pageLoadWait(Long timeInSeconds) {
        driver.manage().timeouts().pageLoadTimeout(timeInSeconds, TimeUnit.SECONDS);
    }

    public static void waitForElementToClickable(WebElement element, Long timeInSeconds) {
        new WebDriverWait(driver, timeInSeconds).until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitTillLoading(int waitTime) {
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
