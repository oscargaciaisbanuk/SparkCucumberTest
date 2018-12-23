package samples

/**
  * Created by oalfonso on 22/1/18.
  */
import cucumber.api.scala.{EN, ScalaDsl}
// import org.apache.spark.sql.DataFrme
import org.junit.Assert._

class HelloStepDefinitions extends ScalaDsl with EN {

  var dataframeFile: String = ""

  Given("^the file (.+)$") { ( fichero: String) =>

    dataframeFile = getClass.getResource(s"/${fichero}").getPath

  }

  Then("^the number of columns is ([0-9]+)$") { (expected: Int) =>

    val df = Hello.LoadCSVtoDF(dataframeFile)
    assertEquals(expected, df.columns.length)
  }

  Then("^the number of rows is ([0-9]+)$") { (expected: Int) =>

    val df = Hello.LoadCSVtoDF(dataframeFile)
    assertEquals(expected, df.count())
  }

}
