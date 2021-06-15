
package com.qa.hooks;

import com.qa.pages.BasePage;
import com.qa.util.BrowserConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage {

	@Before
	public void initBrowser() {
		BrowserConfig.initDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
