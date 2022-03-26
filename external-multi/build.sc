//import $ivy.`com.github.ajrnz::mill-dgraph:0.3.0`


import mill._
import mill.scalalib._
import mill.scalanativelib._
import mill.scalanativelib.api.ReleaseMode
import publish._

//import scala.reflect.api


trait Common extends ScalaModule {
  def platformSegment: String
  def millSourcePath = millOuterCtx.millSourcePath

  def sources = T.sources(
    millSourcePath / "src",
    millSourcePath / s"src-$platformSegment"
  )

  def ivyDeps = Agg(
    ivy"com.lihaoyi::fansi::0.2.14",
    ivy"com.lihaoyi::geny::0.6.10",
  )

  // trait Tests extends super.Tests {
  //   def ivyDeps = Agg(
  //     ivy"com.lihaoyi::utest:0.7.10"
  //   )
  //   def testFramework = "utest.runner.Framework"
  // }

}

object `external-multi` extends Module {
  object jvm extends Common {
    def platformSegment = "jvm"
    def scalaVersion = "2.13.6"
  }

  object native extends Common with ScalaNativeModule {
    def platformSegment = "native"
    def scalaVersion = "2.13.6"
    override def scalaNativeVersion = "0.4.0"

    override def releaseMode = scalanativelib.api.ReleaseMode.ReleaseFast

    // def nativeLinkStubs = T { true }
  }
  
}
