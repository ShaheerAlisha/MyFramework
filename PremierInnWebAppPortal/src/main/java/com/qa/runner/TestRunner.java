package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumberHtmlReport/cucumber-html-report.html",
        "json:target/cucumberHtmlReport/cucumber-json-report.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, glue = {
        "com.qa.stepDefinition"}, features = "classpath:Features"

)
public class TestRunner {
}
