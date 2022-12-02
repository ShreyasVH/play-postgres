name := "play-postgres"

version := "1.0.0"

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies += javaJpa
libraryDependencies += "org.projectlombok" % "lombok" % "1.18.24" % "provided"
libraryDependencies += "org.postgresql" % "postgresql" % "42.5.1"




lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)