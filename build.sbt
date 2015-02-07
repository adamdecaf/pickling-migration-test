name := "pickling-migraion-test"

scalaVersion := "2.11.5"

// scalacOptions ++= Seq("-Xlog-implicits")

libraryDependencies ++= Seq(
  "commons-io" % "commons-io" % "2.4",
  "org.scala-lang.modules" %% "scala-pickling" % "0.10.0"
)
