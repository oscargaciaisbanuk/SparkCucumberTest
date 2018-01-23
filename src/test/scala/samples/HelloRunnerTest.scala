package samples

/**
  * Created by oalfonso on 22/1/18.
  */

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/cucumber/features"),
  plugin = Array("pretty", "html:target/cucumber/html"))
class HelloRunnerTest extends {
}