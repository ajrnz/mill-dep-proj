package proj1

object TagProvider {
  def tags = Seq("proj1") ++ proj1a.TagProvider.tags ++ proj1b.TagProvider.tags
}
