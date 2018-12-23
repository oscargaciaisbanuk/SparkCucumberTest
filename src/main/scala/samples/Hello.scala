package samples

import org.apache.spark.sql.{DataFrame, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by oalfonso on 22/1/18.
  */
object Hello {

  val conf = new SparkConf()
    .setAppName("BDD Test")
    .setMaster("local[*]")

  val sc = new SparkContext(conf)
  val sqlContext = new SQLContext(sc)

  val LoadCSVtoDF = (Fichero: String ) => {

    sqlContext.read
      .format("com.databricks.spark.csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .option("delimiter", ";")
      .load(Fichero)

  }

}
