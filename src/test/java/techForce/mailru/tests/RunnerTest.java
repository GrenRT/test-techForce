package techForce.mailru.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "techForce.mailru.tests",
        tags = "@withdrawal",
        snippets = SnippetType.CAMELCASE)
public class RunnerTest {
}