name := "pk-test"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq("com.monovore" %% "decline-effect" % "1.2.0")

ThisBuild / githubOwner := "d-ogxwx"
ThisBuild / githubRepository := "pk-test"
ThisBuild / githubTokenSource := Some(TokenSource.GitConfig("github.token"))
