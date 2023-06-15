package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/register.feature",glue= {"stepDefinations"},plugin= {
		"pretty","html:target/report.html"})

public class runnerClass {

}
