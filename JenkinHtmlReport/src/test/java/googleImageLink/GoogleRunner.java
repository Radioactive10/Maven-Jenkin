package googleImageLink;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/GoogleSearch.feature",glue= {"googleImageLink"},
monochrome = true,
plugin={"html:target/HTMLreports2"}
)

public class GoogleRunner {
	

}
