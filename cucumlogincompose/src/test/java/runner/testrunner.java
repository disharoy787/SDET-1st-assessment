package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "C:\\Github_workspace\\cucumlogincompose\\src\\test\\resources\\feature\\logincompose.feature" }, 
        glue = {"stepdefinition" }, 
        monochrome = true, 
        dryRun =  false,
        strict = true,
        plugin = {"html:testoutput/testoutputHtmlReport.html","junit:testoutput/cucumberXmlReport.xml","junit:testoutput/cucumberJsonReport.json"}
)
public class testrunner {

}
