package subproj
import utest._

object SubProjTest extends TestSuite {
  val tests = Tests {
    test("tags") {
      subproj.TagProvider.tags ==> Seq("subproj")
    }
  }
}
