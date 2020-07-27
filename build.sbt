name := "pk-test"

organization := "com.github.d-ogxwx"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq("com.monovore" %% "decline-effect" % "1.2.0")

publishMavenStyle := true

pomExtra :=
  <distributionManagement>
  <repository>
    <id>com.github.d-ogxwx</id>
    <name>pk-test</name>
    <url>https://maven.pkg.github.com/d-ogxwx/pk-test</url>
  </repository>
</distributionManagement>

ThisBuild / githubOwner := "d-ogxwx"
ThisBuild / githubRepository := "pk-test"
ThisBuild / githubTokenSource := Some(TokenSource.GitConfig("github.token"))
