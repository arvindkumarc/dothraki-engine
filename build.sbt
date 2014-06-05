name := """play-slick-quickstart"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.2",
  "com.typesafe.play" %% "play-slick" % "0.6.0.1",
  "postgresql" % "postgresql" % "9.1-901.jdbc4"
)

play.Project.playScalaSettings