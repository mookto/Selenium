package Stepdefinations;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(features="src/test/resources/Features/test1.feature",glue= {"Stepdefinations"})
 
public class TestRunner extends AbstractTestNGCucumberTests{}
 