package Stepdefinations;

//import io.cucumber.testNg.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/test1.feature",glue= {"Stepdefinations"})
 

public class TestRunner extends AbstractTestNGCucumberTests{

}
 