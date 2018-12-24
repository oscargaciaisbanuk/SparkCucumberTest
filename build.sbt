name         := "CucumberScalaTest"
version      := "1.1"
organization := "Oscar"

scalaVersion := "2.11.12"
val sparkVersion = "2.4.0"
val cucumberVersion = "1.2.5"
val junitVersion = "4.12"

//run sbt -java-home /usr/lib/jvm/java-8-openjdk-amd64
//if problems with the JVM

libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "info.cukes" %% "cucumber-scala" % cucumberVersion
libraryDependencies += "info.cukes" % "cucumber-junit" % cucumberVersion
libraryDependencies += "junit" % "junit" % junitVersion % Test
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
libraryDependencies += "com.databricks" %% "spark-csv" % "1.5.0"
