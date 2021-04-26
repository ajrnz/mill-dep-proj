import $ivy.`com.lihaoyi::mill-contrib-bloop:0.9.6test`

import mill._, scalalib._

import $file.^.SoftwareVersions, SoftwareVersions.Versions._

object `sub-proj` extends ScalaModule {
  def scalaVersion = commonScalaVersion

  def ivyDeps = Agg(upickleDep)

  object test extends Tests {
    def ivyDeps = Agg(utestDep)
    def testFrameworks = Seq("utest.runner.Framework")
  }
}
