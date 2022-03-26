package proj
import utest._

object ProjTest extends TestSuite {
  val tests = Tests {
    test("tags") {
      proj.Proj.tags ==> Seq("main", "proj1", "proj1a", "proj1b", "proj2", "subproj", "external-lib", "external-multi-JVM")
    }
  }
}
