package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(features="Features", glue="stepDefinition")//folder penyimpanan features file

public class TestRunner {
	
}
	