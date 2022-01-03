package co.com.sofka.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features//practice_form.feature",
                glue = "co.com.sofka.stepdefinition",
        publish = true,
        tags = "not @ofertaMenorAMayor",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PracticeFormTestCucumber {
}
