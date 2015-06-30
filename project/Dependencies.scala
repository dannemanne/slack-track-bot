import sbt._

object Dependencies {
  // Libraries
  val slackScalaClient = "com.bryangilbert" %% "slack-scala-client" % "0.1.0"
  val specs2core = "org.specs2" %% "specs2-core" % "2.4.14"

  // Projects
  val backendDeps =
    Seq(slackScalaClient, specs2core % Test)
}
