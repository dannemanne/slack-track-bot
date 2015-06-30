import Dependencies._

lazy val commonSettings = Seq(
  name := "slack-track-bot",
  version := "0.1.0",
  scalaVersion := "2.11.4"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies ++= backendDeps
  )
