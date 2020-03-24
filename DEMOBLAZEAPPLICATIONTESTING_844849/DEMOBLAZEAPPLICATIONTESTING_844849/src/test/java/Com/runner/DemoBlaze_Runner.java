package Com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Feature/Testcase.feature",
plugin = {"pretty","html:reports/cucumber-html-report"},
tags= {"@tc01_demoblazeloginusingexcel,@tc02_demoblazeloginandlogout,@tc03_demoblazeupdatecart,@tc04_demoblazeplacetheorder"},
glue= {"steps"},
monochrome=true
)

public class DemoBlaze_Runner {

}
