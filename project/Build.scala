import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "Play-2-Twitter-Bootstrap-Integration"
    val moduleOrganization = "info.schleichardt"
    val appVersion      = "0.1-SNAPSHOT"
    val publishingFolder = Path.userHome.absolutePath+"/Projekte/schleichardt.github.com/jvmrepo"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies).settings(
      organization := moduleOrganization,
      publishTo := Some(Resolver.file("file",  new File(publishingFolder))(Resolver.mavenStylePatterns)),
      publishMavenStyle := true,

      lessEntryPoints <<= (sourceDirectory in Compile)(base => {
        val pathToBootstrapLess = base / "assets" / "stylesheets"
        (pathToBootstrapLess / "bootstrap.less") +++ (pathToBootstrapLess / "responsive.less")
      })
    )
}
