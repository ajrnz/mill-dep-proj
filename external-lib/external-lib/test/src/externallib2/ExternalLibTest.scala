package externallib
import utest._

object ExternalLibTest extends TestSuite {
  val tests = Tests{
    test("tags") {
      externallib.TagProvider.tags ==> Seq("external-lib")
    }
  }
}