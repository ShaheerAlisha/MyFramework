package com.qa.pages;

import com.qa.util.BrowserConfig;

public class BasePage extends BrowserConfig {

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

}
