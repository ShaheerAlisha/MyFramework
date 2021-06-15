package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumberHtmlReport/cucumber-html-report.html"}, glue = {
        "com.qa.stepDefinition"}, features = "classpath:features"
)
public class TestRunner {
}