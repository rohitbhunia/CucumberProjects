package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//FeatureFiles/ContactForm.feature"}, 
		glue = "stepDefinitions",
		monochrome=true,
		publish=true
		)
public class TestRun {

	
}
