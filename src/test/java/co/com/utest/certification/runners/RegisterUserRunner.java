package co.com.utest.certification.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/RegisterUser.feature"
        , glue = "co/com/utest/certification/stepdefinitions"
        , snippets = CAMELCASE)
public class RegisterUserRunner {
}
