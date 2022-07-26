package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/Features"},
                 glue= {"Stepdefinitions","Hooks"},
                 plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"},
                 monochrome=true)
                

public class loginrunner {

}
