package proj

object Proj extends App{
  def tags = Seq("main") ++ 
    proj1.TagProvider.tags ++ 
    proj2.TagProvider.tags ++ 
    subproj.TagProvider.tags ++ 
    externallib.TagProvider.tags ++
    externalmulti.JvmTags.tags
  
  val expected = Seq("main", "proj1", "proj1a", "proj1b", "proj2", "subproj", "external-lib", "external-multi-JVM")

  println(s"tags: $tags")
  println(s"expt: $expected")

  assert(tags == expected)
}
