ThisBuild / organization := "Shareprice"

ThisBuild / version := "0.11.0"

lazy val commonSettings = Seq(
  scalaVersion := "2.13.10",
  libraryDependencies ++= Dependencies.all,
  resolvers += Resolver.githubPackages("TheDiscProg"),
  addCompilerPlugin(
    ("org.typelevel" %% "kind-projector" % "0.13.2").cross(CrossVersion.full)
  ),
  addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")
)

lazy val root = (project in file ("."))
  .enablePlugins(ScalafmtPlugin)
  .settings(
    commonSettings,
    name := "shareprice-config",
    Compile / doc/ sources := Seq.empty,
    scalacOptions ++= Scalac.options
  )

githubOwner := "TheDiscProg"
githubRepository := "shareprice-config"

addCommandAlias("cleanTest", ";clean;scalafmt;test:scalafmt;test;")
