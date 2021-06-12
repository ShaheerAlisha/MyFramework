
package com.qa.stepDefinition;

import com.qa.util.BrowserConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BrowserConfig {

	@Before
	public void initBrowser() {
		BrowserConfig.initDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
