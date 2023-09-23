package com.icaro.tests.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
     features = "src/main/resources/features",
        glue={"com.icaro.tests.stepDefinitions", "com.icaro.tests.hooks"},
        snippets=CucumberOptions.SnippetType.CAMELCASE
)

public class CucumberRunner extends AbstractTestNGCucumberTests {
}
