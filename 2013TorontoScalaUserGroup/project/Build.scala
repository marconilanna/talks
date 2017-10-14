import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {
  val appName    = "AppName"
  val appVersion = "1.0"

  val appDependencies = Seq(
      jdbc
    , anorm
    , "mysql"                          %  "mysql-connector-java"        % "5.1.24"
    , "org.scalatest"                  %% "scalatest"                   % "1.9.1"    % "test"
    , "org.seleniumhq.selenium"        %  "selenium-java"               % "2.31.0"   % "test"
    )

  val main = play.Project(appName, appVersion, appDependencies).settings(
      templatesImport ++= Seq("helpers._")
    , scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-Xlint")
    , testOptions in Test := Nil // Disables built-in specs2, it conflicts with ScalaTest
    )
}
