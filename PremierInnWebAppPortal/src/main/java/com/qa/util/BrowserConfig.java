package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * BrowserConfig class contains methods to configure browser driver and abstract method to get title of web pages
 *
 * @author ShaheerAlisha
 */

public abstract class BrowserConfig extends PropManager {

    public static WebDriver driver;

    //Method to get Browser properties bnd initialize driver
    public static void initDriver() {

        // Read Browser details from Property file
        String browser = PropManager.getProp("browserName");

        switch (browser.trim().toLowerCase()) {
            // Initialize Browser
            case "chrome":
                System.setProperty(PropManager.getProp("chromeProperty"), PropManager.getProp("chromePath"));
                driver = new ChromeDriver();
                break;

            case "FF": // Other driver properties and path
                break;

            default:
                break;
        }
        driver.manage().window().maximize();

        // delete cookies
        driver.manage().deleteAllCookies();

        // Wait till page loads
        Timeout.pageLoadWait();

        // Implicit Wait
        Timeout.waitImplicit();

        // Open Web Application URL
        driver.get(PropManager.getProp("url"));

    }

    // Abstract Method
    public abstract String getPageTitle();

}
