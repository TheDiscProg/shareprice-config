import sbt._

object Dependencies {

  lazy val all = Seq(
    "DAPEX" %% "dapex-rabbitmq" % "0.2.0",
    "DAPEX" %% "dapex-kafka" % "0.2.2",
    "io.circe" %% "circe-core" % "0.14.5",
    "io.circe" %% "circe-generic" % "0.14.5",
    "io.circe" %% "circe-parser" % "0.14.5",
    "io.circe" %% "circe-refined" % "0.14.5",
    "io.circe" %% "circe-generic-extras" % "0.14.3",
    "io.circe" %% "circe-config" % "0.10.0",
    "eu.timepit" %% "refined" % "0.10.2",
    "dev.profunktor" %% "fs2-rabbit-circe" % "5.0.0"
  )
}

