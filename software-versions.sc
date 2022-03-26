import mill._, scalalib._

object Versions extends ScalaModule {
  def commonScalaVersion = "2.13.8"

  def scalaVersion = commonScalaVersion

  def upickleDep = ivy"com.lihaoyi::upickle:1.3.11"
  def utestDep = ivy"com.lihaoyi::utest::0.7.9"
  def osLibDep = ivy"com.lihaoyi::os-lib:0.2.2"
}
