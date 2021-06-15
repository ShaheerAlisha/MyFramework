package com.qa.util;

public class CommonPageUtils extends BrowserConfig {

    public String getPageTitle() {
        return driver.getTitle();
    }
}
