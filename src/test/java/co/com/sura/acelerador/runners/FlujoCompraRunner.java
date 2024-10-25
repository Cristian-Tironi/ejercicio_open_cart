package co.com.sura.acelerador.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.com.sura.acelerador.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@FlujoCompra"
)
public class FlujoCompraRunner {
}