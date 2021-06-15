
package com.qa.hooks;

import com.qa.util.BrowserConfig;
import com.qa.util.CommonPageUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Extends CommonPageUtils class and contains Hook methods
 *
 * @author ShaheerAlisha
 */
public class Hooks extends CommonPageUtils {
    // Runs before every scenario
    @Before
    public void initBrowser() {
        BrowserConfig.initDriver();
    }

    // Runs after every scenario
    @After
    public void tearDown() {
        driver.quit();
    }

}
