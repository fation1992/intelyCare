package com.intelyCare.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",

        },
        features = "src/test/resources/features",
        glue = "com/intelyCare/step_definitions",
        dryRun = false,
        tags = ""

)
public class CukesRunner {
}

