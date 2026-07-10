package com.homeloan.runners;


import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;


import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;


@Suite

@IncludeEngines("cucumber")

@SelectClasspathResource("features")


@ConfigurationParameter(
        key = GLUE_PROPERTY_NAME,
        value = "com.homeloan.stepdefinitions"
)


@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "pretty, html:target/cucumber-report.html, com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:, io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
)

@ConfigurationParameter(
        key = FILTER_TAGS_PROPERTY_NAME,
        value = "@Smoke"
)


public class TestRunner {


}