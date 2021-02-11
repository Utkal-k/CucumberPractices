package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features= {"src/test/resources/AppFeatures"},
		glue = {"step"},
		tags = "@utk",
		plugin = {"pretty"}
		)
public class TestRunner {

}
