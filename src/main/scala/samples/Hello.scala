package samples

import org.apache.spark.sql.{DataFrame, SQLContext}

/**
  * Created by oalfonso on 22/1/18.
  */
class Hello(s: SQLContext ) {

  def LoadCSVtoDF(Fichero: String ): DataFrame = {

    s.read
      .format("com.databricks.spark.csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .option("delimiter", ";")
      .load(Fichero)

  }

}
