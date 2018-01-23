package samples

/**
  * Created by oalfonso on 22/1/18.
  */

import cucumber.api.scala.{EN, ScalaDsl}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.{DataFrame, SQLContext}
import org.junit.Assert._
import org.junit.Before

class HelloStepDefinitions extends ScalaDsl with EN {

  var df:DataFrame = null
  var TestApp:Hello =null

  @Before def Setup() {

    val conf = new SparkConf()
      .setAppName("BDD Test")
      .setMaster("local[*]")

    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    TestApp = new Hello(sqlContext)

  }

  Given("^the file (/.+)$") { ( fichero: String) =>

    df = TestApp.LoadCSVtoDF(fichero)

  }

  Then("^the number of columns is ([0-9]+)$") { (expected: Int) =>
    assertEquals(expected, df.columns.length )
  }

  Then("^the number of rows is ([0-9]+)$") { (expected: Int) =>
    assertEquals(expected, df.count())
  }

}