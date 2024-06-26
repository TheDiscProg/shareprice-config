import sbt._

object Dependencies {

  private lazy val simexVersion = "0.8.0"

  lazy val all = Seq(
    "simex" %% "simex-rabbitmq" % simexVersion,
    "simex" %% "simex-kafka" % simexVersion,
    "simex" %% "simex-caching" % simexVersion,
    "simex" %% "simex-messaging" % simexVersion,
    "com.github.pureconfig" %% "pureconfig" % "0.17.4",
    "io.circe" %% "circe-core" % "0.14.5",
    "io.circe" %% "circe-generic" % "0.14.5",
    "io.circe" %% "circe-parser" % "0.14.5",
    "io.circe" %% "circe-refined" % "0.14.5",
    "io.circe" %% "circe-generic-extras" % "0.14.3",
    "io.circe" %% "circe-config" % "0.10.0",
    "dev.profunktor" %% "fs2-rabbit-circe" % "5.0.0",
    "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )
}

