package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/features/DeleteLeadPom.feature"},glue= {"steps","pagescuc"},monochrome=true)
public class RunDeleteLeadPOM {
}