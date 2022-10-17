package Runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/Features/Interaction.feature",
	glue="Stepdefination",
	monochrome=true,
	dryRun=false,
	tags= "@tag5",
	plugin= {
			"pretty",
			"html:test-output"
			}
	)
public class Runner {

}