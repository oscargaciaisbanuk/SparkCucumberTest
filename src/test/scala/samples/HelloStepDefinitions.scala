package samples

/**
  * Created by oalfonso on 22/1/18.
  */
import cucumber.api.scala.{EN, ScalaDsl}
import org.junit.Assert._

class HelloStepDefinitions extends ScalaDsl with EN {

  var results = Results ("", 0, 0)

  Given("^the file (.+)$") { ( fichero: String) =>

    val dataframeFile = getClass.getResource(s"/${fichero}").getPath
    val df = Hello.LoadCSVtoDF(dataframeFile)
    results = Results (dataframeFile, df.columns.length, df.count())

  }

  Then("^the number of columns is ([0-9]+)$") { (expected: Int) =>
    assertEquals(expected, results.columns)
  }

  Then("^the number of rows is ([0-9]+)$") { (expected: Int) =>
    assertEquals(expected, results.count)
  }

}
