import $ivy.`com.lihaoyi::mill-contrib-bloop:0.9.6test`

import mill.scalalib._
import $file.SoftwareVersions, SoftwareVersions.Versions._
import $file.^.`external-lib`.{build => externalLibBuild},
externalLibBuild.`external-lib`
import $file.`sub-proj`.{build => subProjBuild}, subProjBuild.`sub-proj`

object proj extends ScalaModule {
  def scalaVersion = commonScalaVersion
//  def mainClass = Some("test.MainRun")
  def moduleDeps = Seq(proj1, proj2, `sub-proj`, `external-lib`)

  def ivyDeps = Agg(upickleDep)

  object proj1 extends ScalaModule {
    def scalaVersion = commonScalaVersion
    def moduleDeps = Seq(proj1a, proj1b)

    def ivyDeps = Agg(
      ivy"com.lihaoyi::pprint:0.5.0"
    )

    object proj1a extends ScalaModule {
      def scalaVersion = commonScalaVersion
      def ivyDeps = Agg(ivy"com.lihaoyi::pprint:0.6.3")
    }

    object proj1b extends ScalaModule {
      def scalaVersion = commonScalaVersion
      def ivyDeps = Agg(ivy"com.lihaoyi::pprint:0.6.4")
    }
  }

  object proj2 extends ScalaModule {
    def scalaVersion = commonScalaVersion
    def ivyDeps = Agg(ivy"com.lihaoyi::pprint:0.6.2")
  }

  object test extends Tests {
    def ivyDeps = Agg(utestDep)
    def testFrameworks = Seq("utest.runner.Framework")
  }
}
