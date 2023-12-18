package Runner;


import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/Features/Table.feature" },
       glue="Steps",
        monochrome = true, 
        dryRun = !true , 
        plugin= {"pretty"},
       // tags = "@Frames",
		snippets = SnippetType.CAMELCASE)

public class RunnerClass extends AbstractTestNGCucumberTests {

}
