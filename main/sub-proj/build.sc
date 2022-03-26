import $ivy.`com.lihaoyi::mill-contrib-bloop:$MILL_VERSION`

import mill._, scalalib._

import $file.^.^.`software-versions`, `software-versions`.Versions._

object `sub-proj` extends ScalaModule {
  def scalaVersion = commonScalaVersion

  def ivyDeps = Agg(upickleDep)

  object test extends Tests {
    def ivyDeps = Agg(utestDep)
    def testFrameworks = Seq("utest.runner.Framework")
  }
}
