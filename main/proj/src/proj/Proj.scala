package proj

object Proj extends App{
  def tags = Seq("main") ++ proj1.TagProvider.tags ++ proj2.TagProvider.tags ++ subproj.TagProvider.tags ++ externallib.TagProvider.tags
  
  println(s"main tags: $tags")
}
