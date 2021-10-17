package uk.wts.demoShop.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "C:/Users/varsha.pervaram/IdeaProjects/CodiliTest/src/test/resources/featureFiles/viewCart.feature"
        ,glue = "uk.wts.demoShop.stepDefinition", monochrome = true
        ,plugin = {"pretty","html:target/Html/Reports"})

public class verifyMyCart {
}