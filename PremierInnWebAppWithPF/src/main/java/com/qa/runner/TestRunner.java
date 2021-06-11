package com.qa.runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "Pretty", "html:target/cucumberHtmlReport" }, glue = {
		"com.qa.stepDefinition" }, features = "classpath:Features"

)
public class TestRunner {
}
