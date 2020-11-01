name := "scalaenum"

version := "0.1"

scalaVersion := "2.13.3"

lazy val enumeratumVersion = "1.6.1"
lazy val scalaTestVersion  = "3.2.2"

libraryDependencies ++= Seq(
  "com.beachape"  %% "enumeratum" % enumeratumVersion,
  "org.scalactic" %% "scalactic"  % scalaTestVersion,
  "org.scalatest" %% "scalatest"  % scalaTestVersion % "test",
)
