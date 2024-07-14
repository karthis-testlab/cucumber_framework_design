package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		          features = {"src/main/java/features/login.feature"},
		          glue = "steps",
		          dryRun = true,
		          monochrome = true,
		          plugin = {"pretty"}
		        )

public class CucumberTestNGRunner extends AbstractTestNGCucumberTests {

}