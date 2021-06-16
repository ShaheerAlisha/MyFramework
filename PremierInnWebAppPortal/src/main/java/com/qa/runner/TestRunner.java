package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumberHtmlReport/cucumber-html-report.html",
        "json:target/cucumberHtmlReport/cucumber-json-report.json"}, glue = {
        "com.qa.stepDefinition", "com.qa.hooks"}, features = "classpath:features"
)
public class TestRunner {
}