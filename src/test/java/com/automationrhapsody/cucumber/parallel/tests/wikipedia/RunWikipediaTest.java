package com.automationrhapsody.cucumber.parallel.tests.wikipedia;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class) --JUnit
@CucumberOptions(
    format = {
        "json:target/cucumber/wikipedia.json",
        "html:target/cucumber/wikipedia.html",
        "pretty"
    },
    tags = {"~@ignored"}
)
public class RunWikipediaTest extends TestBase {
}
