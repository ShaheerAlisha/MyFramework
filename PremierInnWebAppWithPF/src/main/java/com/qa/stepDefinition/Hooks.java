package com.qa.stepDefinition;

import com.qa.util.BrowserConfig;

import io.cucumber.java.After;
import io.cucumber.java.Before;

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
