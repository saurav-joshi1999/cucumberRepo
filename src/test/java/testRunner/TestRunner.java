package testRunner;

import org.junit.runner.RunWith;



@RunWith(cucumber.api.junit.Cucumber.class)
@cucumber.api.CucumberOptions(features = "src/test/java/features", glue = "stepDefination")
public class TestRunner {

}
